package com.oy.mybatis_plus_demo.service.impl;

import com.oy.mybatis_plus_demo.mapper.UserMapper;
import com.oy.mybatis_plus_demo.entity.User;
import com.oy.mybatis_plus_demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
