package com.wroten.mall.ware.dao;

import com.wroten.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wroten
 * @email xiohu1125@gmail.com
 * @date 2021-09-10 00:47:05
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
