package Register;


import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*用户名*/
        System.out.println("请输入用户名");
        String username = input.next();
        /*密码*/
        System.out.println("请输入密码");
        String password = input.next();
        /*确认密码*/
        System.out.println("请再次输入密码");
        String confirm = input.next();

        if(username.equals("")){
            System.out.println("请输入用户名");
        }else if(password.equals("")){
            System.out.println("请输入密码");
        }else if(confirm.equals("")){
            System.out.println("请再次输入密码以确认");
        }
        else{
            System.out.println("注册成功");
        }

    }
}
