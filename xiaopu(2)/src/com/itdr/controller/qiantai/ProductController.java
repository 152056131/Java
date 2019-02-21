package com.itdr.controller.qiantai;

import com.itdr.common.Pub;
import com.itdr.domain.Product;
import com.itdr.service.qiantai.ProductService;
import com.itdr.service.qiantai.ProductServiceImp;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public class ProductController {

    //
    private ProductService ps = new ProductServiceImp();


    //展示一个商品的信息
    public Product showOne(int pid){
        Product pro = ps.showOne(pid);
        return pro;
    }


    //展示所有商品的信息
    public ArrayList<Product> showAll(){
        ArrayList<Product> li = ps.showAll();
        return li;
    }

    //搜索商品
    public Pub selectMore(String pname){
        Pub p = ps.selectMore(pname);
        return p;
    }

}
