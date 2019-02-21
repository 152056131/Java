package index;

import Goods.GoodsList;
import Goods.ShoppingCar;
import LoginAndRegistre.Login;
import LoginAndRegistre.Register;
import OutPut.outPut;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        /*初始化函数*/

        outPut output = new outPut();
        Login login = new Login();

        double total = 0;
        /*初始化购物车*/
        GoodsList[] product = new GoodsList[3];
        /*初始化商品名称*/
        String goods;
        /*定义需要购买商品的数量*/
        int goodscount;
        /*定义购物车数组*/
        /*定义购物车中需要支付的金额*/
        double money = 0;
        ShoppingCar[] car = new ShoppingCar[10];
        /*初始化购物车商品数量*/
        int j = 0;
        /*初始化选项*/
        int choose;
        String op;
        Scanner input = new Scanner(System.in);
        /*定义注册人数数组*/
        String account[][] = new String[3][2];
        String username;
        String password;
        output.welcom();
        choose = input.nextInt();


        /*注册*/
        while (choose == 1) {
            System.out.println("请输入注册的用户名");
            username = input.next();
            System.out.println("请输入注册的密码");
            password = input.next();
            Register register = new Register(username, password);
            boolean flag = register.register(account);
            if (flag) {

                System.out.println("注册成功");
                System.out.println("现在去登录吗？Y/按任意键退出");
                op = input.next();
                while (op.equals("Y")) {
                    System.out.println("请输入用户名");
                    username = input.next();
                    System.out.println("请输入密码");
                    password = input.next();
                    boolean lflag = login.login(username, password, account);
                    if (lflag) {
                        System.out.println("登录成功");
                        output.AddGoods();
                        op = input.next();
                        /*添加购物车*/
                        if (op.equals("1")) {
                            for (int i = 0; i <= product.length - 1; i++) {
                                System.out.println("请输入商品名称");
                                String name = input.next();
                                System.out.println("请输入商品价格");
                                double price = input.nextDouble();
                                System.out.println("请输入商品的数量");
                                int count = input.nextInt();
                                System.out.println("请输入商品介绍");
                                String detail = input.next();
                                GoodsList goodslist = GoodsList.addGoods(name, price, count, detail);
                                product[i] = goodslist;
                                System.out.println("添加商品成功");
                                System.out.println("是否继续添加？Y继续，按任意键退出");
                                op = input.next();
                                if (!op.equals("Y")) {
                                    System.out.println("添加结束");
                                    break;
                                }
                                if (i == product.length) {
                                    System.out.println("商品已经没有位置摆放了！");
                                }
                            }


                            System.out.println("是否挑选商品至购物车？Y/按任意键退出");
                            op = input.next();
                            while (op.equals("Y")) {
                                for (int i = 0; i < product.length; i++) {
                                    if (product[i] != null) {
                                        System.out.println("商品名称" + product[i].getName());
                                        System.out.println("商品价格" + product[i].getPrice());
                                        System.out.println("商品数量" + product[i].getCount());
                                        System.out.println("商品详情" + product[i].getDetails());
                                        System.out.println("============================");
                                    }
                                }
                                System.out.println("请输入想要购买的商品的名称：");
                                goods = input.next();
                                System.out.println("请输入购买的数量");
                                goodscount = input.nextInt();
                                for (int i = 0; i < product.length; i++) {
                                    if (product[i] != null) {
                                        if ((product[i].getName()).equals(goods)) {
                                            if (product[i].getCount() < goodscount) {
                                                System.out.println("输入的数量太多了，请重新选择！");
                                            } else {
                                                ShoppingCar shop = ShoppingCar.money(goods, product[i].getPrice(), goodscount);
                                                car[j] = shop;
                                                j++;
                                                System.out.println("添加成功，是否继续添加？Y/按任意键退出");
                                                op = input.next();
                                                if (!op.equals("Y")) {
                                                    System.out.println("添加结束");
                                                    for (int m = 0; m <= car.length - 1; m++) {
                                                        if (car[m] != null) {
                                                            total += car[m].getPrice();
                                                        }

                                                    }
                                                    System.out.println("应支付的总金额" + total);
                                                    System.out.println("是否现在支付,Y/任意键");
                                                    op = input.next();
                                                    if (op.equals("Y")) {
                                                        System.out.println("支付成功！");
                                                    } else {
                                                        System.out.println("不买干啥，玩呢！滚犊子！");
                                                        return;
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("你要买的我这没有");
                                        }
                                    }

                                }
                                for (int i = 0; i < car.length; i++) {
                                    if (car[i] != null) {
                                        System.out.println(car[0].getName());
                                        System.out.println(car[0].getPrice());
                                    }
                                }


                            }
                            /*挑选商品*/


                        } else {
                            return;
                        }


                    } else {
                        System.out.println("用户名或密码错误，是否重新输入？Y/任意键退出");
                        op = input.next();
                        if (op.equals("Y")) {
                            break;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                System.out.println("注册失败");
                return;
            }


        }
    }
}
