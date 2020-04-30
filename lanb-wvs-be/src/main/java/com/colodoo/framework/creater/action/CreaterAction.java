package com.colodoo.framework.creater.action;

import com.colodoo.framework.creater.model.*;
import com.colodoo.framework.creater.service.CreaterService;
import com.colodoo.framework.utils.Contants;
import com.github.pagehelper.PageInfo;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/creater")
public class CreaterAction {

    @Autowired
    CreaterService createrService;

    @RequestMapping(value = "/getTables")
    @ResponseBody
    public Map<String, Object> getTables(@RequestBody TablesVO TablesVO) {
        Map<String, Object> rspMap = new HashMap<String, Object>();
        PageInfo<Tables> info = createrService.getTables(TablesVO.getPage());
        rspMap.put(Contants.TABLE_ROWS, info.getList());
        rspMap.put(Contants.TABLE_TOTAL, info.getTotal());
        return rspMap;
    }

    /**
     * 生成查询语句
     *
     * @param tableName
     * @return
     */
    @RequestMapping(value = "/getSelectQuery")
    @ResponseBody
    public String getSelectQuery(String tableName) {
        return createrService.getSelectQuery(tableName);
    }

    /**
     * 生成模板查询语句
     *
     * @param tableName
     * @return
     */
    @RequestMapping(value = "/getSelectQueryByTemplate")
    @ResponseBody
    public Map getSelectQueryByTemplate(String tableName) {
        Map rspMap = new HashMap();
        try {
            String result = createrService.getSelectQueryByTemplate(tableName);
            rspMap.put("result", result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return rspMap;
    }

    /**
     * 生成所有代码字符串（除前端代码）
     *
     * @param allParm
     * @return
     */
    @RequestMapping(value = "/createAllString")
    @ResponseBody
    public Map createAllString(@RequestBody BaseParm allParm) {
        Map rspMap = new HashMap();
        try {
            String mybatisStr = createrService.createMybatisString(allParm);
            String serviceStr = createrService.createServiceString(allParm);
            String actionStr = createrService.createActionString(allParm);
            rspMap.put("msg", "创建成功!");
            rspMap.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            rspMap.put("msg", "创建失败!");
            rspMap.put("success", false);
        }
        return rspMap;
    }

    /**
     * 创建实体类代码
     *
     * @param tableName
     * @return
     */
    @RequestMapping(value = "/createModelString")
    @ResponseBody
    public String createModelString(String tableName) {
        String resultStr = "";
        try {
            resultStr = createrService.createModelString(tableName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return resultStr;
    }

    /**
     * 创建增删改查前端代码
     *
     * @param datagridParm
     * @return
     */
    @RequestMapping(value = "/createDatagridString")
    @ResponseBody
    public Map createDatagridString(DatagridParm datagridParm) {
        Map rspMap = new HashMap();
        try {
            String result = createrService.createDatagridString(datagridParm);
            rspMap.put("result", result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return rspMap;
    }

    /**
     * 创建Mybatis字符串
     *
     * @param mybatisParm
     * @return
     */
    @RequestMapping(value = "/createMybatisString")
    @ResponseBody
    public Map createMybatisString(BaseParm mybatisParm) {
        Map rspMap = new HashMap();
        String result = createrService.createMybatisString(mybatisParm);
        rspMap.put("result", result);
        return rspMap;
    }

    /**
     * 创建接口类
     *
     * @param actionParm
     * @return
     */
    @RequestMapping(value = "/createActionString")
    @ResponseBody
    public Map createActionString(BaseParm actionParm) {
        Map rspMap = new HashMap();
        try {
            String result = createrService.createActionString(actionParm);
            rspMap.put("result", result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return rspMap;
    }

    /**
     * 生成服务类代码
     *
     * @param serviceParm
     * @return
     */
    @RequestMapping(value = "/createServiceString")
    @ResponseBody
    public Map createServiceString(BaseParm serviceParm) {
        Map rspMap = new HashMap();
        try {
            String result = createrService.createServiceString(serviceParm);
            rspMap.put("result", result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rspMap;
    }


}
