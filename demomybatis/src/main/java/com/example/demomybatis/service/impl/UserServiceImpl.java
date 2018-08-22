package com.example.demomybatis.service.impl;

import com.example.demomybatis.domain.User;
import com.example.demomybatis.mapper.UserMapper;
import com.example.demomybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {

        userMapper.insert(user);
        int id = user.getId();
        return id;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addAccount() {

        User user = new User();
        user.setAge(11);
        user.setCreateTime(new Date());
        user.setName("事物测试");
        user.setPhone("10010000");
        int id = user.getId();
        userMapper.insert(user);
        int i = 1/0;

        return id;
    }
}
