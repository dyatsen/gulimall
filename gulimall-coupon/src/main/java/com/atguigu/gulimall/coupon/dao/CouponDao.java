package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dengys
 * @email 705501518@qq.com
 * @date 2021-05-11 10:05:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
