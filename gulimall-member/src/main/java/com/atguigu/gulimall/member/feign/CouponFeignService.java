package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 写上要调用的远程服务的名称
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    // 写上远程服务中对应的方法
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
