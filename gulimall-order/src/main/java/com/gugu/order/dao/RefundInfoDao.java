package com.gugu.order.dao;

import com.gugu.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author Gwynliu7
 * @email sunlightcs@gmail.com
 * @date 2024-08-16 14:52:36
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
