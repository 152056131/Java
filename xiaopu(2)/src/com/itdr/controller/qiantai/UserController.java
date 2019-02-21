package com.itdr.controller.qiantai;

import com.itdr.domain.User;
import com.itdr.service.qiantai.UserService;
import com.itdr.service.qiantai.UserServiceImp;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */

public class UserController {

    //导入业务层
    private  UserService us = new UserServiceImp();

    //要有一些处理请求的方法，比如登录请求、注册请求

    //登录请求
    public boolean login(String uname,String password){
        boolean flag = us.login(uname,password);
        return flag;
    }

    //注册请求
    public boolean register(String uname,String password){
        boolean flag = us.regis(uname,password);
        return flag;
    }

    //查看一个用户信息
    public User show(String uname){
        User u  = us.show(uname);
        return u;
    }
}
