package org.bysj.service.impl;

import org.bysj.entity.DrugTypeEntity;
import org.bysj.mapper.DrugTypeMapper;
import org.bysj.service.DrugTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 药品类型 Service 实现类
 * 
 * 作者: zys
 * 时间: 2023年10月
 */
@Service
public class DrugTypeServiceImpl implements DrugTypeService {

    @Autowired
    private DrugTypeMapper drugTypeMapper;

    /**
     * 获取所有药品类型
     * @return 药品类型列表
     */
    @Override
    public List<DrugTypeEntity> getAllTypes() {
        return drugTypeMapper.selectList(null);
    }

    /**
     * 根据ID获取药品类型
     * @param id 药品类型ID
     * @return 药品类型
     */
    @Override
    public DrugTypeEntity getTypeById(Integer id) {
        return drugTypeMapper.selectById(id);
    }

    /**
     * 保存药品类型
     * @param type 药品类型
     */
    @Override
    public void saveType(DrugTypeEntity type) {
        drugTypeMapper.insert(type);
    }

    /**
     * 更新药品类型
     * @param type 药品类型
     */
    @Override
    public void updateType(DrugTypeEntity type) {
        drugTypeMapper.updateById(type);
    }

    /**
     * 根据ID删除药品类型
     * @param id 药品类型ID
     */
    @Override
    public void deleteType(Integer id) {
        drugTypeMapper.deleteById(id);
    }
} 