package com.itdr.service.qiantai;

import com.itdr.common.Pub;
import com.itdr.data.CartData;
import com.itdr.data.CataDataImp;
import com.itdr.domain.Cart;
import com.itdr.domain.Product;

import java.util.ArrayList;

/**
 * @作者：AirZhang
 * @日期：2019/1/31
 * @用知识武装头脑
 */
public class CartServiceImp implements CartService {


    private CartData cd = new CataDataImp();
    //注入商品业务层
    private ProductService ps = new ProductServiceImp();


    //疑问分析：
    //这里不用判断数据是否存在了，因为数据是可以重复的
    //但是，你需要判断这条数据如果已经存在，不是覆盖，而是将它的数量增加1，这个过程不是在购物车页面
    //分析之后，我发现，如果商品信息存在，我就在存在信息上更改数量即可
    //如果不存在，我才真正的向数据库中增加一条新的商品数据


    //把一个商品加入购物车
    @Override
    public Pub addProduct(String uname, int pid,int pum) {
        Pub p = null;

        //所有用到参数的地方，为了稳妥起见，我都要做非空判断
        if(uname == null || pid <0 || uname.equals("") || uname.equals("null")){
            p = Pub.fail("参数不能为空");
            return p;
        }

        //这里要先去看有没有这条数据，有我就不用在创建对象
        //那就要先到购物车数据库去比对
        ArrayList<Cart> li = cd.selectAllByUname(uname);
        //遍历购物车数据库，已经存在该商品就在原有的数量上增加
        for (Cart cart : li) {
            if(cart.getPid() == pid){
                cart.setPnum(cart.getPnum()+pum);
                p = Pub.success("添加商品成功");
                return p;
            }
        }

        //不存在该商品数据，就创建一条新的购物数据进去
        Cart c = new Cart();
        c.setUname(uname);//设置用户名
        c.setPnum(pum);//设置购物数量
        c.setPid(pid);//设置商品id

        //写到这里，我发现两个问题：
        //1.购物车类缺少一个成员变量，就是该条购物数据的总价
        //2.我想要拿到商品数据，就要根据这一个商品的id去商品数据库中找到这个商品
        Product pro = ps.showOne(pid);
        c.setPrice(pro.getPrice());//设置商品单价
        //如果直接在这里计算这条购物信息的商品总价，一定要写在赋值之后
        c.setNprice(c.getPnum()*c.getPrice());

        boolean bl = cd.addOne(c);



        return null;
    }
}
