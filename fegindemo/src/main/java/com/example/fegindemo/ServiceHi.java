package com.example.fegindemo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SERVICE-HI")
public interface ServiceHi {
     @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayhi(String name);
}

