package org.bysj.service;

import org.bysj.entity.SalesInformationEntity;

import java.util.List;

/**
 * 销售信息 Service 接口
 */
public interface SalesInformationService {
    
    /**
     * 获取所有销售信息
     * @return 销售信息列表
     */
    List<SalesInformationEntity> getAllSales();

    
    /**
     * 根据ID获取销售信息
     * @param id 销售ID
     * @return 销售信息
     */
    SalesInformationEntity getSaleById(Integer id);

    
    /**
     * 保存销售信息
     * @param sale 销售信息
     */
    void saveSale(SalesInformationEntity sale);

    
    /**
     * 更新销售信息
     * @param sale 销售信息
     */
    void updateSale(SalesInformationEntity sale);

    
    /**
     * 根据ID删除销售信息
     * @param id 销售ID
     */
    void deleteSale(Integer id);
} 