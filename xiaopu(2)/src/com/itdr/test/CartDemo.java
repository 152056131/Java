package com.itdr.test;

import com.itdr.data.CommonDataImp;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/31
 * @用知识武装头脑
 */
public class CartDemo {
    public static void main(String[] args) {


        ArrayList a1 = new ArrayList();

        for (Object o : a1) {
            System.out.println(o.hashCode());
        }


    }
}
