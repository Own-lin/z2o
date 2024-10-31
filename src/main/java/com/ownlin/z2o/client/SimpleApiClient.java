package com.ownlin.z2o.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


public interface SimpleApiClient {

  @GetMapping("/hello/open_feign")
  String helloOpenFeign();
}
