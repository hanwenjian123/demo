package com.bw.service.impl;

import com.bw.bean.User;
import com.bw.mapper.UserMapper;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${韩文建} on 2017/7/7.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> showUser() {
        return mapper.showUser();
    }
}
