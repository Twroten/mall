package com.wroten.mall.order.dao;

import com.wroten.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wroten
 * @email xiohu1125@gmail.com
 * @date 2021-09-10 00:43:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
