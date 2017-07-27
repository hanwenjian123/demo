package com.bw.mapper;

import com.bw.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ${韩文建} on 2017/7/7.
 */

@Mapper
@Component
public interface UserMapper {

    List<User> showUser();

}
