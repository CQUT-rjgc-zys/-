package org.bysj.service.impl;

import org.bysj.entity.ManufacturerInformationEntity;
import org.bysj.mapper.ManufacturerInformationEntityMapper;
import org.bysj.service.ManufacturerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 制造商信息 Service 实现类
 * 
 * 作者: zys
 * 时间: 2023年10月
 */
@Service
public class ManufacturerInformationServiceImpl implements ManufacturerInformationService {

    @Autowired
    private ManufacturerInformationEntityMapper manufacturerInformationEntityMapper;

    /**
     * 获取所有制造商信息
     * @return 制造商信息列表
     */
    @Override
    public List<ManufacturerInformationEntity> getAllManufacturers() {
        return manufacturerInformationEntityMapper.selectList(null);
    }

    /**
     * 根据ID获取制造商信息
     * @param id 制造商ID
     * @return 制造商信息
     */
    @Override
    public ManufacturerInformationEntity getManufacturerById(Integer id) {
        return manufacturerInformationEntityMapper.selectById(id);
    }

    /**
     * 保存制造商信息
     * @param manufacturer 制造商信息
     */
    @Override
    public void saveManufacturer(ManufacturerInformationEntity manufacturer) {
        manufacturerInformationEntityMapper.insert(manufacturer);
    }

    /**
     * 更新制造商信息
     * @param manufacturer 制造商信息
     */
    @Override
    public void updateManufacturer(ManufacturerInformationEntity manufacturer) {
        manufacturerInformationEntityMapper.updateById(manufacturer);
    }

    /**
     * 根据ID删除制造商信息
     * @param id 制造商ID
     */
    @Override
    public void deleteManufacturer(Integer id) {
        manufacturerInformationEntityMapper.deleteById(id);
    }
} 