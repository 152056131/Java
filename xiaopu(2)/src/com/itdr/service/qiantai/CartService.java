package com.itdr.service.qiantai;

import com.itdr.common.Pub;

/**
 * @作者：AirZhang
 * @日期：2019/1/31
 * @用知识武装头脑
 */
public interface CartService {
    //把一个商品加入购物车
    Pub addProduct(String uname, int pid,int pum);
}
