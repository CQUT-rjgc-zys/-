package org.bysj.service;

import org.bysj.entity.DrugInformationHistoryEntity;

import java.util.List;

/**
 * 药品信息历史 Service 接口
 */
public interface DrugInformationHistoryService {
    
    /**
     * 获取所有药品信息历史
     * @return 药品信息历史列表
     */
    List<DrugInformationHistoryEntity> getAllHistory();

    
    /**
     * 根据ID获取药品信息历史
     * @param id 药品历史ID
     * @return 药品信息历史
     */
    DrugInformationHistoryEntity getHistoryById(Integer id);

    
    /**
     * 保存药品信息历史
     * @param history 药品信息历史
     */
    void saveHistory(DrugInformationHistoryEntity history);

    
    /**
     * 更新药品信息历史
     * @param history 药品信息历史
     */
    void updateHistory(DrugInformationHistoryEntity history);

    
    /**
     * 根据ID删除药品信息历史
     * @param id 药品历史ID
     */
    void deleteHistory(Integer id);
} 