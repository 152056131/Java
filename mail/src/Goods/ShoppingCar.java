package Goods;

public class ShoppingCar {
    private String name;
    private double price;

    public ShoppingCar() {
    }

    public ShoppingCar(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static ShoppingCar money(String name,double price,int count){
        ShoppingCar shop = new ShoppingCar();
        shop.name = name;
        shop.price = price * count;
        return shop;
    }
    public void show(){
        ShoppingCar shoppingcar = new ShoppingCar();
        System.out.println("您选择购买的商品：");
        System.out.println(shoppingcar.getName());
        System.out.println(shoppingcar.getPrice());
        System.out.println("=========================");

    }
}
