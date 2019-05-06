package com.hr.controller;

import com.hr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/1/715:48
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/ribbon/{id}" )
    public User getBuId(@PathVariable("id") Long id){
        //虚拟IP
        return this.restTemplate.getForObject("http://user-producter/simple/"+id,User.class);
    }
    @GetMapping(value = "/test")
    public String test(){
        ServiceInstance serviceInstance= this.loadBalancerClient.choose("user-producter");
        System.out.println("地址:"+serviceInstance.getUri());

        System.out.println("------------------------");
        ServiceInstance serviceInstance2= this.loadBalancerClient.choose("user-producter2");
        System.out.println("地址:"+serviceInstance2.getUri());
        return "1";
    }

}
