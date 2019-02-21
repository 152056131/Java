package com.itdr.service.qiantai;

import com.itdr.common.Pub;
import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public interface ProductService {
    //展示所有商品的信息
    ArrayList<Product> showAll();

    Product showOne(int pid);

    Pub selectMore(String pname);
}
