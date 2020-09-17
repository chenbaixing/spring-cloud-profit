package com.bx.springcloud.controller;


import com.bx.springcloud.pojo.ProfitTransDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProfitTransDetailController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_TRANS="http://SPRING-CLOUD-PROVIDER";

    @RequestMapping("/consumer/add/profit/trans")
    public boolean add(ProfitTransDetail profitTransDetail) {
        return restTemplate.postForObject(REST_URL_TRANS + "add/profit/trans", profitTransDetail, Boolean.class);
    }



}
