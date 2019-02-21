package com.itdr.data;

import com.itdr.domain.Cart;
import com.itdr.domain.Order;
import com.itdr.domain.Product;
import com.itdr.domain.User;

import java.io.File;
import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public interface CommonData {
    //用户数据库
    User[] getUserDataSZ();
    ArrayList<User> getUserDataJH();
    File getUserDataF();

    //这是用泛型方法的应用，不过不太好理解，我先放在这里
    public<T> T get();

    //商品数据库
    Product[] getProductDataSZ();
    ArrayList<Product> getProductDataJH();
    File getProductDataF();

    //购物车数据库
    Cart[] getCartDataSZ();
    ArrayList<Cart> getCartDataJH();
    File getCartDataF();

    //订单数据库
    Order[] getOrderDataSZ();
    ArrayList<Order> getOrderDataJH();
    File getOrderDataF();
    //xx数据库
}
