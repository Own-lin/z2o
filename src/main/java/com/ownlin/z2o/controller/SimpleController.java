package com.ownlin.z2o.controller;

import com.ownlin.z2o.client.SimpleApiClient;
import com.ownlin.z2o.client.SimpleControllerClient;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    @Resource private SimpleControllerClient simpleControllerClient;
    @Resource private SimpleApiClient simpleApiClient;

    @GetMapping("/hello/spring_boot")
    public String helloSpringBoot() {
        return "Hello Spring Boot!";
    }


    @GetMapping("/hello/feign")
    public String helloFeign() {
        return simpleControllerClient.helloSpringBoot();
    }

    @GetMapping("/hello/nacos_feign")
    public String helloNacosFeign() {
        return simpleApiClient.helloOpenFeign();
    }

}
