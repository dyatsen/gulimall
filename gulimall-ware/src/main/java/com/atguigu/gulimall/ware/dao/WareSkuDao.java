package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author dengys
 * @email 705501518@qq.com
 * @date 2021-05-11 10:34:36
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
