package com.itdr.test;

import com.itdr.controller.qiantai.UserController;
import com.itdr.domain.User;
import com.itdr.utils.JDBCUtil2;

import org.junit.Test;

import java.sql.Connection;
import java.util.Scanner;

/**
 * @作者：AirZhang
 * @日期：2019/2/18
 * @用知识武装头脑
 */
public class TestJunitDemo {

    @Test
    public void test1() throws Exception {
        Connection con = JDBCUtil2.getCon();
        System.out.println(con);
    }

    @Test
    public void test2(){

        UserController us = new UserController();
        String uss = "小cj";

        User u = us.show(uss);
        if(u != null){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
