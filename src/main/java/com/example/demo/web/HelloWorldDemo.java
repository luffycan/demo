package com.example.demo.web;

import com.example.demo.dao.TestsetDao;
import com.example.demo.entity.Testset;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldDemo {

    @Autowired
    TestsetDao testsetDao;

    @RequestMapping("/hello")
    public String hello(){
        return "hello Spring boot";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return new User();
    }
    @RequestMapping("/list")
    public List<Testset> getList(){
        return testsetDao.findAll();
    }
}
