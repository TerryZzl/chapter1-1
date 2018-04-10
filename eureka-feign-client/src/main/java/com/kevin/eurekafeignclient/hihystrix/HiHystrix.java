package com.kevin.eurekafeignclient.hihystrix;

import com.kevin.eurekafeignclient.api.EurekaFeignClient;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaFeignClient {

    @Override
    public String sayHiFromEurekaClient(String name) {
        return "error!";
    }
}
