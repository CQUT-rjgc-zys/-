package org.bysj.service.impl;

import org.bysj.entity.DrugInformationHistoryEntity;
import org.bysj.mapper.DrugInformationHistoryMapper;
import org.bysj.service.DrugInformationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 药品信息历史 Service 实现类
 * 
 * 作者: zys
 * 时间: 2023年10月
 */
@Service
public class DrugInformationHistoryServiceImpl implements DrugInformationHistoryService {

    @Autowired
    private DrugInformationHistoryMapper drugInformationHistoryMapper;

    /**
     * 获取所有药品信息历史
     * @return 药品信息历史列表
     */
    @Override
    public List<DrugInformationHistoryEntity> getAllHistory() {
        return drugInformationHistoryMapper.selectList(null);
    }

    /**
     * 根据ID获取药品信息历史
     * @param id 药品历史ID
     * @return 药品信息历史
     */
    @Override
    public DrugInformationHistoryEntity getHistoryById(Integer id) {
        return drugInformationHistoryMapper.selectById(id);
    }

    /**
     * 保存药品信息历史
     * @param history 药品信息历史
     */
    @Override
    public void saveHistory(DrugInformationHistoryEntity history) {
        drugInformationHistoryMapper.insert(history);
    }

    /**
     * 更新药品信息历史
     * @param history 药品信息历史
     */
    @Override
    public void updateHistory(DrugInformationHistoryEntity history) {
        drugInformationHistoryMapper.updateById(history);
    }

    /**
     * 根据ID删除药品信息历史
     * @param id 药品历史ID
     */
    @Override
    public void deleteHistory(Integer id) {
        drugInformationHistoryMapper.deleteById(id);
    }
} 