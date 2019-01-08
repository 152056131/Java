package work;

import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
//        11、题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
        Scanner input = new Scanner(System.in);
        System.out.println("输入两个正整数，以回车键分开");
        int first = input.nextInt();
        int second = input.nextInt();
        int x = (first<second)?first:second;
        //最大公因数
        for(int i=x;i>=1;i--){
            if(first%i==0&second%i==0) {
                System.out.println(i);
                break;
            }
        }
        //最小公倍数
        int y = (first>second)?first:second;
        for(int i = 1;i<=x;i++){
            if((i*y)%x==0){
                System.out.println(i*y);
                break;
            }
        }
    }
}
