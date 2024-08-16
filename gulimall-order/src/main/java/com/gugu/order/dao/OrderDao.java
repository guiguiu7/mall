package com.gugu.order.dao;

import com.gugu.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Gwynliu7
 * @email sunlightcs@gmail.com
 * @date 2024-08-16 14:52:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
