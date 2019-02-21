package com.itdr.test;

import com.itdr.controller.qiantai.UserController;

import java.util.Scanner;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public class TestDemo {

    //
    private static UserController uc = new UserController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //测试注册方法
        System.out.println("注册："+uc.register(sc.next(),sc.next()));

        //测试登录方法
        System.out.println("登录："+uc.login(sc.next(),sc.next()));

        //获取一个用户信息
        System.out.println("用户信息："+uc.show(sc.next()).getUpassword());



    }
}
