package com.wroten.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wroten.common.utils.PageUtils;
import com.wroten.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wroten
 * @email xiohu1125@gmail.com
 * @date 2021-09-04 16:52:06
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

