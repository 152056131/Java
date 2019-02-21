package com.itdr.data;

import com.itdr.domain.User;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public interface UserData {
    //对用户数据库的增删改查
    boolean add(User u);

    void deleteOne(String uname);

    void changeOne(String uanme);

    boolean selectOne(String uanme);

    User selectOneUser(String uanme);

    void selectAll();
}
