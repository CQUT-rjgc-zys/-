package org.bysj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bysj.entity.DrugInformationHistoryEntity;

/**
 * 药品信息历史 Mapper 接口
 */
@Mapper
public interface DrugInformationHistoryMapper extends BaseMapper<DrugInformationHistoryEntity> {
    // 可以在这里添加自定义查询方法
} 