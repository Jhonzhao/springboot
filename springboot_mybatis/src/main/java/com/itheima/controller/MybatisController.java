package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/query")
    @ResponseBody
    List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @RequestMapping("/insert")
    public void insertUserList(){
        User user = new User();
        //user.setId(3);
        user.setUsername("wangwu");
        user.setPassword("123");
        user.setName("王五");
        userMapper.insertUserList(user);
    }

    @RequestMapping("/delete")
    public void deleteUserList(){

        userMapper.deleteUserList(14);
    }

}
