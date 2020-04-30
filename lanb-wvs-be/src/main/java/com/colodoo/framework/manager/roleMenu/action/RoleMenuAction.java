package com.colodoo.framework.manager.roleMenu.action;

import com.colodoo.framework.exception.AppException;
import com.colodoo.framework.manager.roleMenu.model.RoleMenu;
import com.colodoo.framework.manager.roleMenu.model.RoleMenuVO;
import com.colodoo.framework.manager.roleMenu.service.RoleMenuService;
import com.colodoo.framework.utils.Contants;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
* @author colodoo
* @date 2019-4-25 17:07:42
* @description
*/
@Controller
@RequestMapping(value = "/roleMenu")
@CrossOrigin
public class RoleMenuAction {

    @Autowired
    RoleMenuService roleMenuService;

	/**
	 * 新增数据
	 * 
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/save")
    @ResponseBody
    public Map<String, Object> save(@RequestBody RoleMenu model) {
        Map<String, Object> rspMap = new HashMap<String, Object>();
        int ret = roleMenuService.saveRoleMenu(model);
        if(ret > 0) {
            rspMap.put("success", true);
        } else {
            rspMap.put("msg", Contants.MSG_SAVE_FAIL);
        }
        return rspMap;
    }

	/**
	 * 删除数据
	 * 
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Map<String, Object> delete(@RequestBody RoleMenu model) {
        Map<String, Object> rspMap = new HashMap<String, Object>();
        int ret = roleMenuService.deleteRoleMenu(model);
        if(ret > 0) {
            rspMap.put("success", true);
        } else {
            rspMap.put("msg", Contants.MSG_DELETE_FAIL);
        }
        return rspMap;
    }

	/**
	 * 更新数据
	 * 
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Map<String, Object> update(@RequestBody RoleMenu model) {
        Map<String, Object> rspMap = new HashMap<String, Object>();
        int ret = roleMenuService.updateRoleMenu(model);
        if(ret > 0) {
            rspMap.put("success", true);
        } else {
            rspMap.put("msg", Contants.MSG_UPDATE_FAIL);
        }
        return rspMap;
    }

	/**
	 * 根据id查找单条数据
	 * 
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/queryById")
    @ResponseBody
    public Map<String, Object> queryById(@RequestBody RoleMenu model) {
        Map<String, Object> rspMap = new HashMap<String, Object>();
        rspMap.put("rows", roleMenuService.queryById(model));
        return rspMap;
    }

	/**
	 * 查找列表
	 * 
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/query")
    @ResponseBody
    public List<RoleMenuVO> query(@RequestBody RoleMenuVO model) {
        return roleMenuService.query(model);
    }

	/**
	 * 查找分页列表
	 * 
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/queryPage")
    @ResponseBody
    public Map<String, Object> queryPage(@RequestBody RoleMenuVO model) {
        Map<String, Object> rspMap = new HashMap<String, Object>();
        PageInfo<RoleMenuVO> info = roleMenuService.query(model.getPage(), model);
        rspMap.put(Contants.TABLE_ROWS, info.getList());
        rspMap.put(Contants.TABLE_TOTAL, info.getTotal());
        return rspMap;
    }

    @RequestMapping(value = "/loadRoleMenu")
    @ResponseBody
    public Map<String, Object> loadRoleMenu() {
        Map<String, Object> rspMap = new HashMap<String, Object>();
        PageInfo<RoleMenu> info = null;
        try {
            roleMenuService.loadRoleMenu();
            rspMap.put("success", true);
            rspMap.put("msg", "操作成功");
        } catch (AppException e) {
            rspMap.put("success", false);
            rspMap.put("msg", "操作失败");
        }
        return rspMap;
    }
}
