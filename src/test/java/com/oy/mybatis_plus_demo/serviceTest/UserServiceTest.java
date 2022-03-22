package com.oy.mybatis_plus_demo.serviceTest;

import com.oy.mybatis_plus_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testGetCount(){
        long count = userService.count();
        System.out.println("总记录数：" + count);
    }
}
