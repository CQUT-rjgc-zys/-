package org.bysj.service.impl;

import org.bysj.entity.DrugInformationHistoryEntity;
import org.bysj.mapper.DrugInformationHistoryEntityMapper;
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
    private DrugInformationHistoryEntityMapper drugInformationHistoryEntityMapper;

    /**
     * 获取所有药品信息历史
     * @return 药品信息历史列表
     */
    @Override
    public List<DrugInformationHistoryEntity> getAllHistory() {
        return drugInformationHistoryEntityMapper.selectList(null);
    }

    /**
     * 根据ID获取药品信息历史
     * @param id 药品历史ID
     * @return 药品信息历史
     */
    @Override
    public DrugInformationHistoryEntity getHistoryById(Integer id) {
        return drugInformationHistoryEntityMapper.selectById(id);
    }

    /**
     * 保存药品信息历史
     * @param history 药品信息历史
     */
    @Override
    public void saveHistory(DrugInformationHistoryEntity history) {
        drugInformationHistoryEntityMapper.insert(history);
    }

    /**
     * 更新药品信息历史
     * @param history 药品信息历史
     */
    @Override
    public void updateHistory(DrugInformationHistoryEntity history) {
        drugInformationHistoryEntityMapper.updateById(history);
    }

    /**
     * 根据ID删除药品信息历史
     * @param id 药品历史ID
     */
    @Override
    public void deleteHistory(Integer id) {
        drugInformationHistoryEntityMapper.deleteById(id);
    }
} 