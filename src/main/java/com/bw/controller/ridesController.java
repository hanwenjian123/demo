package com.bw.controller;

import com.bw.bean.User;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ${hanwenjian} on 2017/7/13.
 */
@RestController
public class ridesController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserService service;

    @RequestMapping("/test")
    public List<User> showUser() {
        List<User> user = service.showUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
        return user;
    }
    //Redis实验
    @RequestMapping("/redisuser")
    public User redisUser(){
        User user = null;
        ValueOperations<String ,User> operations = redisTemplate.opsForValue();
        Boolean exists = redisTemplate.hasKey("user");
        if(exists){
            user =  operations.get("user");

            System.out.println("exists is true" + user.getUname());
        }else{

            List<User> users = service.showUser();
                       for (User user1 : users) {
                operations.set("user",user1);
            }

            System.out.println("exists is false");
        }
        return user;

    }

}
