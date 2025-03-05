package org.bysj.service.impl;

import org.bysj.entity.SalesInformationEntity;
import org.bysj.mapper.SalesInformationEntityMapper;
import org.bysj.service.SalesInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 销售信息 Service 实现类
 * 
 * 作者: zys
 * 时间: 2023年10月
 */
@Service
public class SalesInformationServiceImpl implements SalesInformationService {

    @Autowired
    private SalesInformationEntityMapper salesInformationEntityMapper;

    /**
     * 获取所有销售信息
     * @return 销售信息列表
     */
    @Override
    public List<SalesInformationEntity> getAllSales() {
        return salesInformationEntityMapper.selectList(null);
    }

    /**
     * 根据ID获取销售信息
     * @param id 销售ID
     * @return 销售信息
     */
    @Override
    public SalesInformationEntity getSaleById(Integer id) {
        return salesInformationEntityMapper.selectById(id);
    }

    /**
     * 保存销售信息
     * @param sale 销售信息
     */
    @Override
    public void saveSale(SalesInformationEntity sale) {
        salesInformationEntityMapper.insert(sale);
    }

    /**
     * 更新销售信息
     * @param sale 销售信息
     */
    @Override
    public void updateSale(SalesInformationEntity sale) {
        salesInformationEntityMapper.updateById(sale);
    }

    /**
     * 根据ID删除销售信息
     * @param id 销售ID
     */
    @Override
    public void deleteSale(Integer id) {
        salesInformationEntityMapper.deleteById(id);
    }
} 