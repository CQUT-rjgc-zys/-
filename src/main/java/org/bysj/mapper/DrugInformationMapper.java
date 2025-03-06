package org.bysj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bysj.entity.DrugInformationEntity;

/**
 * 药品信息 Mapper 接口
 */
@Mapper
public interface DrugInformationMapper extends BaseMapper<DrugInformationEntity> {
    // 可以在这里添加自定义查询方法
} 