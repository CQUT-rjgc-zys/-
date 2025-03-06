package org.bysj.service.impl;

import org.bysj.entity.DrugInformationEntity;
import org.bysj.mapper.DrugInformationMapper;
import org.bysj.service.DrugInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 药品信息 Service 实现类
 * 
 * 作者: zys
 * 时间: 2025-03-04
 */
@Service
public class DrugInformationServiceImpl implements DrugInformationService {

    @Autowired
    private DrugInformationMapper drugInformationMapper;

    /**
     * 获取所有药品信息
     * 
     * @return 药品信息列表
     */
    @Override
    public List<DrugInformationEntity> getAllDrugs() {
        return drugInformationMapper.selectList(null);
    }

    /**
     * 根据ID获取药品信息
     * 
     * @param id 药品ID
     * @return 药品信息
     */
    @Override
    public DrugInformationEntity getDrugById(Integer id) {
        return drugInformationMapper.selectById(id);
    }

    /**
     * 保存药品信息
     * 
     * @param drug 药品信息
     */
    @Override
    public void saveDrug(DrugInformationEntity drug) {
        drugInformationMapper.insert(drug);
    }

    /**
     * 更新药品信息
     * 
     * @param drug 药品信息
     */
    @Override
    public void updateDrug(DrugInformationEntity drug) {
        drugInformationMapper.updateById(drug);
    }

    /**
     * 根据ID删除药品信息
     * 
     * @param id 药品ID
     */
    @Override
    public void deleteDrug(Integer id) {
        drugInformationMapper.deleteById(id);
    }
} 