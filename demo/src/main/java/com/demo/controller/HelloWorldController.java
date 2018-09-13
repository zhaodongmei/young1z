package com.demo.controller;

import com.demo.domain.DemoProperties;
import com.demo.domain.User;
import com.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);
    @Autowired
    private UserService userService;
    @Autowired
    DemoProperties demoProperties;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/user")
    public User getUser(int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count(@RequestParam String type) {
        LOG.info("type:"+type);
        return userService.totalUserCount();
    }
}
