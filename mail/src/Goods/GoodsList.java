package Goods;

public class GoodsList {
    private String name;
    private String details;
    private double price;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /*设定商品的数量*/
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static GoodsList addGoods(String name, double price, int count,String details ){



        GoodsList goodslist = new GoodsList();
        goodslist.name = name;
        goodslist.price = price;
        goodslist.count = count;
        goodslist.details = details;

        return goodslist;
    }
}
