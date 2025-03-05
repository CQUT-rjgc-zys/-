package org.bysj.service.impl;

import org.bysj.entity.DrugTypeEntity;
import org.bysj.mapper.DrugTypeEntityMapper;
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
    private DrugTypeEntityMapper drugTypeEntityMapper;

    /**
     * 获取所有药品类型
     * @return 药品类型列表
     */
    @Override
    public List<DrugTypeEntity> getAllTypes() {
        return drugTypeEntityMapper.selectList(null);
    }

    /**
     * 根据ID获取药品类型
     * @param id 药品类型ID
     * @return 药品类型
     */
    @Override
    public DrugTypeEntity getTypeById(Integer id) {
        return drugTypeEntityMapper.selectById(id);
    }

    /**
     * 保存药品类型
     * @param type 药品类型
     */
    @Override
    public void saveType(DrugTypeEntity type) {
        drugTypeEntityMapper.insert(type);
    }

    /**
     * 更新药品类型
     * @param type 药品类型
     */
    @Override
    public void updateType(DrugTypeEntity type) {
        drugTypeEntityMapper.updateById(type);
    }

    /**
     * 根据ID删除药品类型
     * @param id 药品类型ID
     */
    @Override
    public void deleteType(Integer id) {
        drugTypeEntityMapper.deleteById(id);
    }
} 