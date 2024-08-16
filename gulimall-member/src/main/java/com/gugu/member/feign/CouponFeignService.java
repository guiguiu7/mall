package com.gugu.member.feign;

import com.gugu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Gwynliu7
 * @date 2024/8/16&19:29
 */

/**
 * 这是一个声名式的远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupon();
}
