package shop;


import java.util.Scanner;

public class  Product{
  public static int id = 1001;
    String name;
    int price;

    public static void main(String[] args) {
        Product product = new Product();
        Scanner input = new Scanner(System.in);
        System.out.println("输入商品名");
        String name = input.next();
        System.out.println("输入价格");
        int price = input.nextInt();
        product.name = name;
        product.price = price;
        pro(name,price);
        show(product);
        Product.id++;
    }


    public static Product pro(String name,int price){
        Product product = new Product();
        product.name = name;
        product.price = price;
        System.out.println("商品序号"+product.id+"商品名称"+product.name+"商品价格"+product.price);
        return product;
    }
    public static void show(Product product){
        System.out.println("商品序号"+product.id+"商品名称"+product.name+"商品价格"+product.price);
    }




}