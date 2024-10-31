package com.ownlin.z2o.api;

import com.ownlin.z2o.client.SimpleApiClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/api")
public class SimpleApi implements SimpleApiClient {

    @Override
    public String helloOpenFeign() {
        return "It's random number: " + Math.random();
    }
}
