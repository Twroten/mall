package com.wroten.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wroten.common.utils.PageUtils;
import com.wroten.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author wroten
 * @email xiohu1125@gmail.com
 * @date 2021-09-10 00:43:09
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

