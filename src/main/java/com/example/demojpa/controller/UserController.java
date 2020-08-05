package com.example.demojpa.controller;

import com.example.demojpa.entity.User;
import com.example.demojpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //注入到容器中
    @Autowired
    UserRepository userRepository;
    //查询
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.getOne(id);
        return user;
    }
    @GetMapping("/user")
    public User inserUser( User user){
        User save = userRepository.save(user);
        return save;
    }
    @GetMapping("/delete")
        public User deleteUser(){
        //指定删除的
        userRepository.deleteById(4);
        return null;
    }

}
