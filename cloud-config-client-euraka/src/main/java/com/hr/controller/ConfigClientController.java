package com.hr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/1/1511:23
 * @copyright {@link www.hndfsj.com}
 */
@RestController
public class ConfigClientController {
    @Value("${profile}")
    private String profile;
    @GetMapping(value = "/profile")
    public String getProFile() {
        return profile;
    }
}
