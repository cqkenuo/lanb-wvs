package com.colodoo.manager.scan.scanResult.service;

import com.colodoo.framework.base.abs.BaseService;
import com.colodoo.framework.exception.DAOException;
import com.colodoo.framework.utils.Contants;
import com.colodoo.manager.scan.scanResult.model.PieChartVO;
import com.colodoo.manager.scan.scanResult.model.ScanResult;
import com.colodoo.manager.scan.scanResult.model.ScanResultVO;
import com.colodoo.framework.easyui.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.colodoo.manager.scan.scanResult.service.mapper.ScanResultSQLMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
* @author colodoo
* @date 2020-3-23 20:21:24
* @description 
*/
@Service
@Slf4j
public class ScanResultService extends BaseService<ScanResult> {

	@Autowired
	ScanResultSQLMapper sqlMapper;

    /**
    * 新增数据
    *
    * @param model
    * @return
    */
    public int saveScanResult(ScanResult model) {
        int ret = Contants.CODE_FAILED;
        model.setScanResultId(uuid());
        Date datetime = new Date();
        model.setCreateTime(datetime);
        model.setUpdateTime(datetime);
        // model.setLastDate(new Date());
        try {
            ret = this.insert(model);
        } catch (DAOException e) {
            log.error(e.getMsg());
        }
        return ret;
    }

    /**
    * 删除数据
    *
    * @param model
    * @return
    */
    public int deleteScanResult(ScanResult model) {
        int ret = Contants.CODE_FAILED;
        try {
            ret = this.delete(model.getScanResultId());
        } catch (DAOException e) {
            log.error(e.getMsg());
        }
        return ret;
    }

    /**
    * 更新数据
    *
    * @param model
    * @return
    */
    public int updateScanResult(ScanResult model) {
        int ret = Contants.CODE_FAILED;
        try {
            ret = this.update(model);
        } catch (DAOException e) {
            log.error(e.getMsg());
        }
        return ret;
    }

    /**
    * 根据id查找单条数据
    *
    * @param model
    * @return
    */
    public ScanResult queryById(ScanResult model) {
        ScanResult scanResult = null;
        try {
            scanResult = this.get(model.getScanResultId());
        } catch (DAOException e) {
            log.error(e.getMsg());
        }
        return scanResult;
    }

    /**
    * 查找列表
    *
    * @return
    */
    public List<ScanResult> query(ScanResultVO model) {
        List<ScanResult> list = null;
        list = sqlMapper.getScanResultList(model);
        return list;
    }

    /**
    * 查找分页列表
    *
    * @param page
    * @return
    */
    public PageInfo<ScanResult> query(Page page, ScanResultVO model) {
        PageInfo<ScanResult> pageInfo;
        List<ScanResult> list = null;
        PageHelper.startPage(page.getPage(), page.getRows());
        list = sqlMapper.getScanResultList(model);
        pageInfo = new PageInfo<ScanResult>(list);
        return pageInfo;
    }

    /**
     * 资产漏洞数
     *
     * @return
     */
    public List<PieChartVO> getAssetbugsCount(ScanResultVO model) {
        List<PieChartVO> list = null;
        model.setCreateUserId(this.getSessionObject().getUser().getUserId());
        list = sqlMapper.getAssetbugsCount(model);
        return list;
    }

    /**
     * 待处理漏洞
     *
     * @param model
     * @return
     */
    public List<PieChartVO> getTodoBugCount(ScanResultVO model) {
        List<PieChartVO> list = null;
        model.setCreateUserId(this.getSessionObject().getUser().getUserId());
        list = sqlMapper.getTodoBugCount(model);
        return list;
    }
}
