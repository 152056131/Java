package work;

import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
//        13、由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else),并且从小到大输出
        System.out.println("输入三个整数,以回车键分开");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1>=num2){
            int count;
            count = num1;
            num1=num2;
            num2=count;
        }
        System.out.println(num1+","+num2+","+num3);
        if(num3<=num1){
            int count;
            count = num3;
            num3=num1;
            num1=count;
        }
        if(num3<=num2){
            int count;
            count=num3;
            num3=num2;
            num2=count;
        }
        System.out.println(num1+","+num2+","+num3);
    }
}
