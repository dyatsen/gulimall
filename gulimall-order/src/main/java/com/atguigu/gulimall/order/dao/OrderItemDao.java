package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author dengys
 * @email 705501518@qq.com
 * @date 2021-05-11 10:28:23
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
