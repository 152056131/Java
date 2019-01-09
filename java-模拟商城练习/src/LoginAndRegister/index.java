package LoginAndRegister;


import shop.Product;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] userinfo = new String[3][2];
        Product product = new Product();
        String checked;
        Product[] p = new Product[3];

        while (true) {
            System.out.println("选择功能");
            System.out.println("1.登录");
            System.out.println("2.注册");
            int choose = input.nextInt();
            /*登陆过程*/
            if (choose == 1) {
                while (true) {
                    System.out.println("请输入用户名");
                    String username = input.next();
                    System.out.println("请输入密码");
                    String password = input.next();
//                    login.login(username, password, userinfo);
                    boolean flag = login.login(username, password, userinfo);
                    System.out.println(userinfo[0][0]);
                    System.out.println(userinfo[0][1]);
                    if (flag) {
                        System.out.println("登陆成功");
                        System.out.println("请选择接下来的操作：1.添加商品列表");
                        int func = input.nextInt();
                        if(func ==1){
                            for(int i = 0;i<p.length;i++){
                                product.id = 1001;
                                System.out.println("输入商品名");
                                String name = input.next();
                                System.out.println("输入价格");
                                int price = input.nextInt();
                                p[i] = product.pro(name,price );
                                product.id++;

                            }
                            for(int i = 0;i<p.length;i++){
                                System.out.println(p[i]);
                            }

                        }else{
                            return;
                        }
                    } else {
                        System.out.println("用户名或密码错误");
                        System.out.println("是否退出程序？");
                        checked = input.next();
                        if (checked.equals("Y")) {
                            return;
                        } else {
                        }
                    }
                }
            }



            /*注册过程*/
            register:
            if (choose == 2) {
                String check;
                while (true) {
                    System.out.println("请输入注册的用户名");
                    String username = input.next();
                    System.out.println("请输入注册的密码");
                    String password = input.next();
                    register.registered(username, password, userinfo);
                    System.out.println("是否注册？Y/N");
                    check = input.next();
                    if (!check.equals("Y")) {
                        System.out.println("现在就去登陆吗？Y/N");
                        checked = input.next();
                        if (checked.equals("Y")) {
                            choose = 1;
                            break register;

                        } else {
                            return;
                        }


                    } else {
                        for (int i = 0; i < userinfo.length; i++) {
                            for (int j = 0; j < userinfo[i].length; j++) {
                                System.out.print(userinfo[i][j]);
                            }
                            System.out.println("");
                        }
                    }


                }

            }
        }
    }
}