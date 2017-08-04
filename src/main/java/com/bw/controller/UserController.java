package com.bw.controller;

import com.bw.bean.User;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/show")
    public List<User> showUser() {
        List<User> user = service.showUser();
        for (User user1 : user) {
            System.out.println(user1);
        }

        return user;
    }
    @RequestMapping("/")
    public void hellw() {
        System.out.println("hello word! 222222222222");

    }


}
