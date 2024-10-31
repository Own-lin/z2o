package com.ownlin.z2o.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    contextId = "SimpleApiClient",
    value = "z2o",
    path = "/z2o/simple/api")
public interface SimpleApiClient {

  @GetMapping("/hello/open_feign")
  String helloOpenFeign();
}
