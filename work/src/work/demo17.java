package work;

import java.util.Scanner;

public class demo17 {
    //    要求用户输入用户名和密码，只要不是admin和111就提示用户名或密码不正确，请重新输入。正确时结束循环，提示登陆成功
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        String password;

        do {
            System.out.println("请输入用户名");
            username = input.next();
            System.out.println("请输入密码");
            password = input.next();

            if (username.equals("admin") && password.equals("111")) {
                System.out.println("登录成功");
            } else {
                System.out.println("用户名或密码不正确，请重新输入");
            }

        } while (!username.equals("admin") || !password.equals("111"));
    }
}
