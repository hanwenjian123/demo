package com.bw.controller;

import com.bw.bean.User;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ${hanwenjian} on 2017/7/8.
 */
@Controller
public class IndexController {

    @Autowired
    /*private UserService service;*/

   /* @RequestMapping("demo")
    public String hello(Map<String,Object> map) {

      *//*  List<User> user = service.showUser();*//*
        List<User> users = new ArrayList<>();
        User u = new User();
        u.setUpwd("123");
        u.setId(111);
        u.setUname("ergou");
        users.add(u);
        map.put("users",users);

        return "index";
    }*/

    @RequestMapping("tai")
    public String tai() {
        return "login";
    }
}
