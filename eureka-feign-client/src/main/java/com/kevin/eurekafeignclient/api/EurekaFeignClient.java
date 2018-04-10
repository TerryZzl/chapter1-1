package com.kevin.eurekafeignclient.api;

import com.kevin.eurekafeignclient.config.FeignConfig;
import com.kevin.eurekafeignclient.hihystrix.HiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EUREKA-CLIENT",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaFeignClient {
    @GetMapping(value = "/hi")
    String sayHiFromEurekaClient(@RequestParam(value = "name") String name);
}
