package com.doujg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author
 * @create 2017-12-12 14:33
 **/
@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulApplication {

    public static void main(String []args){
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }
}
