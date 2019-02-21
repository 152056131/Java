package com.itdr.data;

import com.itdr.domain.User;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public class UserDataImp implements UserData{

    //我这里要有数据库
    private static ArrayList<User> uli = new CommonDataImp().getUserDataJH();


    @Override
    public boolean add(User u) {
        return uli.add(u);
    }

    @Override
    public void deleteOne(String uname) {

    }

    @Override
    public void changeOne(String uanme) {

    }

    @Override
    public boolean selectOne(String uanme) {
        //我要在这里去用户的数据库中查找有没有这个用户？
        boolean b = false;

        for (User user : uli) {
            if(uanme.equals(user.getUname())){
                b =  true;
            }
        }
        return b;
    }

    @Override
    public User selectOneUser(String uanme) {
        //我要在这里去用户的数据库中查找有没有这个用户？
        User u = null;

        for (User user : uli) {
            if(uanme.equals(user.getUname())){
                u = user;
            }
        }
        return u;
    }

    @Override
    public void selectAll() {

    }
}
