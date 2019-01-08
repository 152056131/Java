package work;

import java.util.Scanner;

public class demo15 {
    public static void main(String[] args) {
//        15、输入数量不确定的正数和负数（一次输入一个），然后打印整数和负数的个数，当输入0时，程序停止
        Scanner input = new Scanner(System.in);
        int num;
        int numUp = 0;
        int numDown = 0;
        do{
            num = input.nextInt();
            if(num>0){
                numUp++;
            }
            else if(num<0){
                numDown++;
            }
        }while(num!=0);
        System.out.println(numUp+","+numDown);
    }
}
