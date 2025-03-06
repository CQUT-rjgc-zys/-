package org.bysj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bysj.entity.ManufacturerInformationEntity;

/**
 * 制造商信息 Mapper 接口
 */
@Mapper
public interface ManufacturerInformationMapper extends BaseMapper<ManufacturerInformationEntity> {
    // 可以在这里添加自定义查询方法
} 