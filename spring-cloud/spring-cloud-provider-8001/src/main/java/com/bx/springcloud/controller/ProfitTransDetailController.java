package com.bx.springcloud.controller;


import com.bx.springcloud.pojo.ProfitTransDetail;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfitTransDetailController {

    @PostMapping("add/profit/trans")
    public boolean addProfitTrans(ProfitTransDetail profitTransDetail){
        return true;
    }

}
