package com.wroten.mall.product.dao;

import com.wroten.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wroten
 * @email xiohu1125@gmail.com
 * @date 2021-09-04 16:52:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
