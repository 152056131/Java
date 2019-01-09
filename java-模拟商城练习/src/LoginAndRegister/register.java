package LoginAndRegister;

import java.util.Scanner;

public class register {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userinfo[][] = new String[3][2];
        String check;
        while (true) {
            System.out.println("请输入注册的用户名");
            String username = input.next();
            System.out.println("请输入注册的密码");
            String password = input.next();
            registered(username, password, userinfo);
            System.out.println("是否注册？Y/N");
            check = input.next();
            if (!check.equals("Y")) {
                System.out.println("123");

                return;
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

    public static void registered(String username, String password, String userinfo[][]) {
        boolean register = false;
        while (true) {
            Scanner input = new Scanner(System.in);

            /*判断注册是否继续*/
            boolean flag = false;

            while (!flag) {
                /*   接收用户名和密码   */

                /*判断注册列表是否为空*/
                boolean full = false;

                /*判断注册是否成功*/
                register = true;
                /*设置数组存储注册信息*/



                /*判断账号信息是否存在*/
                for (int i = 0; i < userinfo.length; i++) {
                    if (username.equals(userinfo[i][0])) {
                        System.out.println("该用户名已经存在，请重新输入");
                        return;

                    }
                }


                /*注册成功*/
                register:
                if (register) {
                    wrapper:
                    for (int i = 0; i < userinfo.length; i++) {
                        if (userinfo[i][0] == null) {
                            for (int j = 0; j <= i; j++) {
                                if (!username.equals(userinfo[j][0])) {
                                    userinfo[i][0] = username;
                                    userinfo[i][1] = password;
//                                    register = true;
                                    break wrapper;
                                }
//                                break wrapper;
                            }

                        } else if (i == userinfo.length - 1 && userinfo[i][0] != null) {
                            System.out.println("注册用户已满");
                            return;
                        }
                    }
                    System.out.println("注册成功");
                    return;


                }

                /*注册信息已满*/


            }


        }
    }

}



