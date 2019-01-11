package index;

import Person.DataBase;
import Person.Login;
import Person.person;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choose;
        person person = new person();
        Login login = new Login();
        DataBase db = new DataBase();
        while (true) {
            System.out.println("请登录！");
            System.out.println("请输入用户名");
            String name = input.next();
            System.out.println("请输入密码");
            String password = input.next();
            db.add(person);
            double money = person.getPrice();
            boolean flag = login.login(person, name, password);
            System.out.println(flag);
            if (flag) {
                person.show(person);
                System.out.println("选择接下来的操作");
                System.out.println("1.充值");
                System.out.println("2.买饭");
                choose = input.next();
                /*充值功能*/
                if (choose.equals("1")) {
                    System.out.println("输入充值的金额");
                    money = input.nextDouble();
                    money = money + person.getPrice();
                    person.setPrice(money);
                    System.out.println("充值成功");
                    person.show(person);
                    System.out.println("选择接下来的操作");
                    System.out.println("1.充值");
                    System.out.println("2.买饭");
                    choose = input.next();
                    if (choose.equals("2")) {
                        System.out.println("请选择套餐");
                        System.out.println("1.两荤一素8元");
                        System.out.println("2.一荤荤一素6元");
                        System.out.println("3.一荤两素7元");
                        int op;
                        op = input.nextInt();
                        switch (op) {
                            case 1:
                                money -= 8;
                                break;
                            case 2:
                                money -= 6;
                                break;
                            case 3:
                                money -= 7;
                                break;
                            default:
                                System.out.println("没有你要吃的！");
                                break;
                        }
                        person.setPrice(money);
                        System.out.println("消费成功");
                        System.out.println("卡内余额：" + person.getPrice());
                        return;

                    }

                }
                else if(choose.equals("2")){
                    if(money<8){
                        System.out.println("卡内余额不足，请及时充值");
                    }
                    System.out.println("请选择套餐");
                    System.out.println("1.两荤一素8元");
                    System.out.println("2.一荤荤一素6元");
                    System.out.println("3.一荤两素7元");
                    int op;
                    op = input.nextInt();
                    switch (op) {
                        case 1:
                            money -= 8;
                            break;
                        case 2:
                            money -= 6;
                            break;
                        case 3:
                            money -= 7;
                            break;
                        default:
                            System.out.println("没有你要吃的！");
                            break;
                    }
                    person.setPrice(money);
                    System.out.println("消费成功");
                    System.out.println("卡内余额：" + person.getPrice());
                    break;
                }
            } else {
                System.out.println("用户名或密码错误，请重新输入或退出");
                System.out.println("1.重新输入");
                System.out.println("按任意键退出");
                choose = input.next();
                if (!choose.equals("1")) {
                    return;
                }


            }
        }


    }
}
