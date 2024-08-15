package com.gugu.gulimall.product.dao;

import com.gugu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Gwynliu7
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 22:01:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
