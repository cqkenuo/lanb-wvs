package com.colodoo.framework.manager.user.action;

import com.colodoo.framework.common.Msg;
import com.colodoo.framework.common.SessionObject;
import com.colodoo.framework.manager.log.model.Log;
import com.colodoo.framework.manager.user.model.User;
import com.colodoo.framework.manager.user.service.UserService;
import com.colodoo.framework.easyui.Page;
import com.colodoo.framework.exception.AppException;
import com.colodoo.framework.utils.Contants;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(description = "用户管理")
public class UserAction {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/loginCheck")
	@ResponseBody
	@ApiOperation(value = "登陆验证",notes = "验证登陆信息")
	public Msg loginCheck(@RequestBody User model, HttpServletRequest request) {
		Msg msg = new Msg();
		HttpSession session = request.getSession();
		SessionObject sessionObject = (SessionObject) session.getAttribute(Contants.SESSION_OBJECT_KEY);
		try {
			// 已经登录
			if (sessionObject != null && sessionObject.getUser() != null) {
				msg.setSuccess(true);
				msg.setData(sessionObject);
				msg.setMsg(Contants.LOGINED);
			} else {
				// 登录成功
				msg = userService.loginCheck(model, request);
				if (msg.isSuccess()) {
					Subject subject = SecurityUtils.getSubject();
					UsernamePasswordToken token = new UsernamePasswordToken(model.getUserId(), model.getPassword());
					subject.login(token);
					msg.setMsg(Contants.LOGIN_SUCCESS);
				} else {// 登录失败
					msg.setSuccess(false);
					msg.setMsg(Contants.LOGIN_FAIL);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@RequestMapping(value = "/logout")
	@ResponseBody
	public Msg logout(HttpSession session) {
		Msg msg = new Msg();
		SessionObject sessionObject = (SessionObject) session.getAttribute(Contants.SESSION_OBJECT_KEY);
		if (sessionObject != null && sessionObject.getUser() != null) {
			sessionObject.setUser(null);
			sessionObject.setRoleUsers(null);
			Subject subject = SecurityUtils.getSubject();
			subject.logout();
		}
		msg.setSuccess(true);
		msg.setMsg("注销成功!");
		return msg;
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public Map register(@RequestBody User model) {
		Map map = new HashMap();
		boolean isSuccessed = false;
		try {
			isSuccessed = userService.saveRegister(model);
			if (isSuccessed) {
				map.put("success", true);
				map.put("msg", "注册成功!");
			} else {
				map.put("success", false);
				map.put("msg", "注册失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return map;
	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public Map save(@RequestBody User model) {
		Map rspMap = new HashMap();
		int ret = userService.save(model);
		if (ret > 0) {
			rspMap.put("success", true);
		} else {
			rspMap.put("errorMsg", "保存失败");
		}
		return rspMap;
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public Map delete(@RequestBody User model) {
		Map rspMap = new HashMap();
		int ret = userService.delete(model);
		if (ret > 0) {
			rspMap.put("success", true);
		} else {
			rspMap.put("errorMsg", "删除失败");
		}
		return rspMap;
	}

	@RequestMapping(value = "/update")
	@ResponseBody
	public Map update(@RequestBody User model) {
		Map rspMap = new HashMap();
		int ret = userService.update(model);
		if (ret > 0) {
			rspMap.put("success", true);
		} else {
			rspMap.put("errorMsg", "更新失败");
		}
		return rspMap;
	}

	@RequestMapping(value = "/queryById")
	@ResponseBody
	public Map queryById(User model) {
		Map rspMap = new HashMap();
		rspMap.put("rows", userService.queryById(model));
		return rspMap;
	}

	@RequestMapping(value = "/query")
	@ResponseBody
	public List<User> query() {
		return userService.query();
	}

	@RequestMapping(value = "/queryPage")
	@ResponseBody
	public Map query(Page page) {
		Map rspMap = new HashMap();
		PageInfo info = userService.query(page);
		rspMap.put("rows", info.getList());
		rspMap.put("total", info.getTotal());
		return rspMap;
	}
}
