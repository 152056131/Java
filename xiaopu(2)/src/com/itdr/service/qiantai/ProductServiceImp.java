package com.itdr.service.qiantai;

import com.itdr.common.Pub;
import com.itdr.data.ProductData;
import com.itdr.data.ProductDataImp;
import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/30
 * @用知识武装头脑
 */
public class ProductServiceImp implements ProductService {

    //
    private ProductData pd = new ProductDataImp();


    //展示所有商品的信息
    @Override
    public ArrayList<Product> showAll() {
        ArrayList<Product> li = pd.selectAll();


        if(li != null || li.size() != 0 ){
            return li;
        }
        return null;
    }

    @Override
    public Product showOne(int pid) {
        Product pro = pd.selectOne(pid);

        if(pro == null || pro.getSx() == 0 ){
            return null;
        }

        return pro;
    }

    @Override
    public Pub selectMore(String pname) {
        ArrayList<Product> li = pd.selectMore(pname);
        Pub p = Pub.fail("您搜索的商品不存在");

        if(li != null && li.size() != 0 ){
            p = Pub.success(li);
            return p;
        }


        return p;
    }
}
