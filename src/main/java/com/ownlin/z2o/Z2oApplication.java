package com.ownlin.z2o;

import com.feiniaojin.gracefulresponse.EnableGracefulResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableGracefulResponse
@SpringBootApplication
public class Z2oApplication {

    public static void main(String[] args) {
        SpringApplication.run(Z2oApplication.class, args);
    }

}
