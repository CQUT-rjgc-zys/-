package org.bysj.service;

import org.bysj.entity.DrugInformationEntity;

import java.util.List;

/**
 * 药品信息 Service 接口
 */
public interface DrugInformationService {
    
    /**
     * 获取所有药品信息
     * @return 药品信息列表
     */
    List<DrugInformationEntity> getAllDrugs();

    
    /**
     * 根据ID获取药品信息
     * @param id 药品ID
     * @return 药品信息
     */
    DrugInformationEntity getDrugById(Integer id);

    
    /**
     * 保存药品信息
     * @param drug 药品信息
     */
    void saveDrug(DrugInformationEntity drug);

    
    /**
     * 更新药品信息
     * @param drug 药品信息
     */
    void updateDrug(DrugInformationEntity drug);

    
    /**
     * 根据ID删除药品信息
     * @param id 药品ID
     */
    void deleteDrug(Integer id);
} 