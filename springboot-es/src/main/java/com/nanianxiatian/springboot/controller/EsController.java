package com.nanianxiatian.springboot.controller;

import com.nanianxiatian.springboot.entity.UserEntity;
import com.nanianxiatian.springboot.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author nanianxiatian
 * @date 2021-2-23 19:01
 */
@RestController
public class EsController {

    @Autowired
    private UserDao userDao;
    //添加文档
    @RequestMapping("/addUser")
    public UserEntity  addUser(@RequestBody UserEntity userEntity){
        return  userDao.save(userEntity);
    }

    //查询文档
    @RequestMapping("/findById")
    public Optional<UserEntity> findById(String id){
        return userDao.findById(id);
    }
}
