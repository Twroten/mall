package com.wroten.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wroten.common.utils.PageUtils;
import com.wroten.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wroten
 * @email xiohu1125@gmail.com
 * @date 2021-09-04 16:52:06
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

