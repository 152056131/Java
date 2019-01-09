package LoginAndRegister;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] userinfo = new String[3][2];

        for (int i = 0; i <= userinfo.length - 1; i++) {
            for (int j = 0; j <= userinfo[i].length - 1; j++) {
                userinfo[i][j] = "admin";
            }
        }

        while (true) {
            System.out.println("请输入用户名");
            String username = input.next();
            System.out.println("请输入密码");
            String password = input.next();
            login(username,password ,userinfo );
            boolean flag = login(username,password ,userinfo );
            if(flag){
                System.out.println("登陆成功");
                return;
            }else{
                System.out.println("用户名或密码错误，请重新登陆");
            }
        }
    }

    public static boolean login(String username, String password, String[][] userinfo) {
            boolean flag = true;
        wrapper:    for (int i = 0; i <= userinfo.length - 1; i++) {
                if (username.equals(userinfo[i][0]) && password.equals(userinfo[i][1])) {

                    flag = true;
                    break;
                } else {

                    flag = false;
                }

        }

        return flag;

    }
}
