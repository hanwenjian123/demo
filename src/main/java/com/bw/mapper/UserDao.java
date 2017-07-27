package com.bw.mapper;

import com.bw.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ${hanwenjian} on 2017/7/13.
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
