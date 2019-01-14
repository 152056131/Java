package practice;

import java.util.Scanner;

public class demo8 {
    /*
     题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
     例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
     程序分析：关键是计算出每一项的值。
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.println("请输入数字a");
        a = input.nextInt();
        System.out.println("请输入个数");
        int count = input.nextInt();
        int x[] = new int[count];
        x[0] = a;
        int num = a;
        for(int i = 1;i<=x.length-1;i++){
            x[i] = x[i-1]*10+a;
            num +=x[i];


        }
        System.out.print(num+"=");
        for(int i =0;i<=x.length-2;i++){
            System.out.print(x[i]);
            System.out.print("+");


        }System.out.print(x[x.length-1]);




    }
}
