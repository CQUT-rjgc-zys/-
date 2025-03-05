package org.bysj.service;

import org.bysj.entity.DrugTypeEntity;

import java.util.List;

/**
 * 药品类型 Service 接口
 */
public interface DrugTypeService {
    
    /**
     * 获取所有药品类型
     * @return 药品类型列表
     */
    List<DrugTypeEntity> getAllTypes();

    
    /**
     * 根据ID获取药品类型
     * @param id 药品类型ID
     * @return 药品类型
     */
    DrugTypeEntity getTypeById(Integer id);

    
    /**
     * 保存药品类型
     * @param type 药品类型
     */
    void saveType(DrugTypeEntity type);

    
    /**
     * 更新药品类型
     * @param type 药品类型
     */
    void updateType(DrugTypeEntity type);

    
    /**
     * 根据ID删除药品类型
     * @param id 药品类型ID
     */
    void deleteType(Integer id);
} 