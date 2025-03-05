package org.bysj.controller;

import org.bysj.entity.SalesInformationEntity;
import org.bysj.service.SalesInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 销售信息控制器，提供销售信息的CRUD操作。
 */
@RestController
@RequestMapping("/sales")
public class SalesInformationController {

    @Autowired
    private SalesInformationService salesInformationService;

    /**
     * 获取所有销售信息。
     * @return 销售信息列表
     */
    @GetMapping
    public List<SalesInformationEntity> getAllSales() {
        return salesInformationService.getAllSales();
    }

    /**
     * 根据ID获取销售信息。
     * @param id 销售ID
     * @return 销售信息
     */
    @GetMapping("/{id}")
    public SalesInformationEntity getSaleById(@PathVariable Integer id) {
        return salesInformationService.getSaleById(id);
    }

    /**
     * 保存销售信息。
     * @param sale 销售信息
     */
    @PostMapping
    public void saveSale(@RequestBody SalesInformationEntity sale) {
        salesInformationService.saveSale(sale);
    }

    /**
     * 更新销售信息。
     * @param sale 销售信息
     */
    @PutMapping
    public void updateSale(@RequestBody SalesInformationEntity sale) {
        salesInformationService.updateSale(sale);
    }

    /**
     * 根据ID删除销售信息。
     * @param id 销售ID
     */
    @DeleteMapping("/{id}")
    public void deleteSale(@PathVariable Integer id) {
        salesInformationService.deleteSale(id);
    }
} 