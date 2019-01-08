package work;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
//        1、要求用户输入一个年份，判断并输出该年份是闰年还是平年。
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year%400==0&&year%100==0||year%100!=0&&year%4==0){
            System.out.println(year+"是闰年");
        }
        else{
            System.out.println(year+"不是闰年");
        }
    }
}
