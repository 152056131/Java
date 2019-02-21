package com.itdr.domain;

/**
 * @作者：AirZhang
 * @日期：2019/1/9
 * @用知识武装头脑
 */

/*
* 这是一个商品类
* */
public class Product {
    //商品属性
    private int id;
    private String pname;
    private double price;
    private String xq;

    //标记属性
    private int sx = 1;//商品上下架，默认为1，上架
    private int hot;//商品是否热卖，默认为0，不热卖

    public int getSx() {
        return sx;
    }

    public void setSx(int sx) {
        this.sx = sx;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pricse) {
        this.price = pricse;
    }

    public String getXq() {
        return xq;
    }

    public void setXq(String xq) {
        this.xq = xq;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", xq='" + xq + '\'' +
                '}';
    }
}
