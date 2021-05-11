package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dengys
 * @email 705501518@qq.com
 * @date 2021-05-11 08:55:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
