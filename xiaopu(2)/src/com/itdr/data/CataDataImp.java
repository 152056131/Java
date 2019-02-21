package com.itdr.data;

import com.itdr.domain.Cart;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/31
 * @用知识武装头脑
 */
public class CataDataImp implements CartData {

    private CommonData cd = new CommonDataImp();


    //获取所有的购物车信息
    @Override
    public ArrayList<Cart> selectAll() {
        return null;
    }

    //获取该用户的所有购物信息
    @Override
    public ArrayList<Cart> selectAllByUname(String uname) {
        //创建一个集合，准备接收符合要求的数据
        ArrayList<Cart> li = new ArrayList<>();
        //通过公共的数据库模拟类，获取到购物车数据库，并对它遍历
        for (Cart cart : cd.getCartDataJH()) {
            //非空判断，保证从购物车数据库中拿出的数据不会出现空指针异常
            if(cart != null){
                //当拿出的数据跟我传参过来的用户名相同时，说明是该用户的购物信息
                if(cart.getUname().equals(uname)){
                    //将符合要求的购物信息放到一开始准备好的集合里。
                    li.add(cart);
                }
            }
        }
        return li;
    }

    @Override
    public boolean addOne(Cart c) {

        return false;
    }
}
