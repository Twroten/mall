package com.wroten.mall.member.feigh;

import com.wroten.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式远程调用方法
 */
@FeignClient("mall-coupon-service")
public interface CouponFeighService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
