package com.ownlin.z2o.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    contextId = "SimpleControllerClient",
    value = "z2o",
    path = "/z2o/simple",
    url = "localhost:${server.port:8080}")
public interface SimpleControllerClient {

  @GetMapping("/hello/spring_boot")
  String helloSpringBoot();
}
