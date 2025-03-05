package org.bysj.controller;

import org.bysj.entity.DrugTypeEntity;
import org.bysj.service.DrugTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 药品类型控制器，提供药品类型的CRUD操作。
 */
@RestController
@RequestMapping("/drug-types")
public class DrugTypeController {

    @Autowired
    private DrugTypeService drugTypeService;

    /**
     * 获取所有药品类型。
     * @return 药品类型列表
     */
    @GetMapping
    public List<DrugTypeEntity> getAllTypes() {
        return drugTypeService.getAllTypes();
    }

    /**
     * 根据ID获取药品类型。
     * @param id 药品类型ID
     * @return 药品类型
     */
    @GetMapping("/{id}")
    public DrugTypeEntity getTypeById(@PathVariable Integer id) {
        return drugTypeService.getTypeById(id);
    }

    /**
     * 保存药品类型。
     * @param type 药品类型
     */
    @PostMapping
    public void saveType(@RequestBody DrugTypeEntity type) {
        drugTypeService.saveType(type);
    }

    /**
     * 更新药品类型。
     * @param type 药品类型
     */
    @PutMapping
    public void updateType(@RequestBody DrugTypeEntity type) {
        drugTypeService.updateType(type);
    }

    /**
     * 根据ID删除药品类型。
     * @param id 药品类型ID
     */
    @DeleteMapping("/{id}")
    public void deleteType(@PathVariable Integer id) {
        drugTypeService.deleteType(id);
    }
} 