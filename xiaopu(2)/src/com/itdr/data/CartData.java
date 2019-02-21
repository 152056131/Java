package com.itdr.data;

import com.itdr.domain.Cart;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/31
 * @用知识武装头脑
 */
public interface CartData {
    //获取所有的购物车信息
    ArrayList<Cart> selectAll();

    //获取该用户的所有购物信息
    ArrayList<Cart> selectAllByUname(String uname);

    boolean addOne(Cart c);
}
