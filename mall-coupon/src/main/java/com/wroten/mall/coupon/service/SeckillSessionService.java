package com.wroten.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wroten.common.utils.PageUtils;
import com.wroten.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author wroten
 * @email xiohu1125@gmail.com
 * @date 2021-09-10 00:04:54
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

