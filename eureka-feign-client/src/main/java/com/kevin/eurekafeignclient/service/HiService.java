package com.kevin.eurekafeignclient.service;

import com.kevin.eurekafeignclient.api.EurekaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    EurekaFeignClient eurekaFeignClient;
    public String sayHi(String name){
        return eurekaFeignClient.sayHiFromEurekaClient(name);
    }
}
