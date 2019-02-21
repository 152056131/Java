package com.itdr.data;

import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public interface ProductData {
    ArrayList<Product> selectAll();

    Product selectOne(int pid);

    ArrayList<Product> selectMore(String pname);
}
