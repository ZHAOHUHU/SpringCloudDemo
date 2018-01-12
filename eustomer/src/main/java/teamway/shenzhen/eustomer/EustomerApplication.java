package teamway.shenzhen.eustomer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
这代表他是一个服务是向注册中心注册的
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class EustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EustomerApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi,你好" + name + "，，，我来自" + port;
    }
}
