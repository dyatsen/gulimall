package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用步骤，这里是member远程调用coupon
 * 1.引入open-feign依赖
 * 2.编写一个接口（在feign包中）
 *  在接口上加上 @FeignClient("gulimall-coupon") 注解，说明该接口要调用名为"gulimall-coupon"的远程服务
 *  在要调用远程服务的方法上加上远程服务的地址@RequestMapping("/coupon/coupon/member/list")
 * 3.开启远程调用功能@EnableFeignClients
 */

@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
