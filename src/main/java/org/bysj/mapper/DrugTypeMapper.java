package org.bysj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bysj.entity.DrugTypeEntity;

/**
 * 药品类型 Mapper 接口
 */
@Mapper
public interface DrugTypeMapper extends BaseMapper<DrugTypeEntity> {
    // 可以在这里添加自定义查询方法
} 