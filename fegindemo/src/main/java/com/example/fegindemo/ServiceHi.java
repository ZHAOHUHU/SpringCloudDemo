package com.example.fegindemo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface ServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayhello(@RequestParam(value = "name") String name);
}

