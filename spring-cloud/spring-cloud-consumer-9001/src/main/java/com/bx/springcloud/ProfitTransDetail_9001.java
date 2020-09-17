package com.bx.springcloud;


import com.bx.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRING-CLOUD-PROVIDER",configuration = MyRule.class)
public class ProfitTransDetail_9001 {

    public static void main(String[] args) {

        SpringApplication.run(ProfitTransDetail_9001.class,args);

    }

}
