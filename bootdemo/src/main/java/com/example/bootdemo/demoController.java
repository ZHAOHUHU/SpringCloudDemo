package com.example.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

   @Autowired
    HelloService helloService;
         @RequestMapping("/hi")
    public String hi(String name) {
    return helloService.hiService(name);
         }
}
