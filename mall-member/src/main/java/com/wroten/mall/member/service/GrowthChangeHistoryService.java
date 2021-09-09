package com.wroten.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wroten.common.utils.PageUtils;
import com.wroten.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author wroten
 * @email xiohu1125@gmail.com
 * @date 2021-09-10 00:35:17
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

