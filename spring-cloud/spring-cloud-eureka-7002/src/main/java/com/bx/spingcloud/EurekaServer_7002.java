package com.bx.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *Eureka注册中心，启动后访问 http://localhost:7001/
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7002 {

    public static void main(String[] args){

        SpringApplication.run(EurekaServer_7002.class,args);

    }

}
