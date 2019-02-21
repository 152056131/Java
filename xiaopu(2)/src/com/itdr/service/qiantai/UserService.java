package com.itdr.service.qiantai;

import com.itdr.domain.User;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public interface UserService {
    //定义规则的过程：
    //用户登录
    boolean login(String uname,String password);

    boolean regis(String uname, String password);

    User show(String uname);

    //用户注册
    //查看用户信息
}
