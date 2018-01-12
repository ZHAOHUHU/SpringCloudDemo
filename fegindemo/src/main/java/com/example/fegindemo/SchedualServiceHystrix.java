package com.example.fegindemo;

import com.example.fegindemo.ServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystrix implements ServiceHi {
    @Override
    public String sayhello(String name) {
        return "sorry"+name;
    }
}
