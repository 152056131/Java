package work;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
//        2、要求用户输入两个整数，判断第一个整数是否是第二个整数的倍数。
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一个整数");
        int first = input.nextInt();
        System.out.println("输入第二个整数");
        int second = input.nextInt();
        if (first % second == 0){
            System.out.println(first + "是"+ second + "的倍数");
        }
        else{
            System.out.println(first + "不是" + second +"的倍数");
        }
    }
}
