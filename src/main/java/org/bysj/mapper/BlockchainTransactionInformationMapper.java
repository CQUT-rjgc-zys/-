package org.bysj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.bysj.entity.BlockchainTransactionInformationEntity;

/**
 * 区块链交易信息 Mapper 接口
 */
@Mapper
public interface BlockchainTransactionInformationMapper extends BaseMapper<BlockchainTransactionInformationEntity> {
    // 可以在这里添加自定义查询方法
}
