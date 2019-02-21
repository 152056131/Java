package com.itdr.domain;

/**
 * @作者：AirZhang
 * @日期：2019/1/15
 * @用知识武装头脑
 */
public class Cart {
    //序号
    private int id;
    //用户名
    private String uname;
    //商品id
    private int pid;
    //商品数量
    private int pnum;
    //商品单价
    private double price;
    //总价格
    private double nprice;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public double getNprice() {
        return nprice;
    }

    public void setNprice(double nprice) {
        this.nprice = nprice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", uname=" + uname +
                ", pid=" + pid +
                ", pnum=" + pnum +
                ", nprice=" + nprice +
                '}';
    }
}
