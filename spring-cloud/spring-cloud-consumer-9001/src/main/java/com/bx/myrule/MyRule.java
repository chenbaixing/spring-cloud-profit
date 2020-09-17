package com.bx.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: csp1999
 * @Date: 2020/05/19/11:58
 * @Description: 自定义规则
 */
@Configuration
public class MyRule {

    @Bean
    public IRule selfRule(){
        return new com.bx.myrule.MyRandomRule();//默认是轮询,现在自定义为自己的
    }
}
