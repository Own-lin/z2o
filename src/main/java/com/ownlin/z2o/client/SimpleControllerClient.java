package com.ownlin.z2o.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


public interface SimpleControllerClient {

  @GetMapping("/hello/spring_boot")
  String helloSpringBoot();
}
