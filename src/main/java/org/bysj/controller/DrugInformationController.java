package org.bysj.controller;

import org.bysj.entity.DrugInformationEntity;
import org.bysj.service.DrugInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 药品信息控制器，提供药品信息的CRUD操作。
 */
@RestController
@RequestMapping("/drugs")
public class DrugInformationController {

    @Autowired
    private DrugInformationService drugInformationService;

    /**
     * 获取所有药品信息。
     * @return 药品信息列表
     */
    @GetMapping
    public List<DrugInformationEntity> getAllDrugs() {
        return drugInformationService.getAllDrugs();
    }

    /**
     * 根据ID获取药品信息。
     * @param id 药品ID
     * @return 药品信息
     */
    @GetMapping("/{id}")
    public DrugInformationEntity getDrugById(@PathVariable Integer id) {
        return drugInformationService.getDrugById(id);
    }

    /**
     * 保存药品信息。
     * @param drug 药品信息
     */
    @PostMapping
    public void saveDrug(@RequestBody DrugInformationEntity drug) {
        drugInformationService.saveDrug(drug);
    }

    /**
     * 更新药品信息。
     * @param drug 药品信息
     */
    @PutMapping
    public void updateDrug(@RequestBody DrugInformationEntity drug) {
        drugInformationService.updateDrug(drug);
    }

    /**
     * 根据ID删除药品信息。
     * @param id 药品ID
     */
    @DeleteMapping("/{id}")
    public void deleteDrug(@PathVariable Integer id) {
        drugInformationService.deleteDrug(id);
    }
} 