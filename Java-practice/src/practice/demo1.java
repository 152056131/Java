package practice;

import java.util.Scanner;

public class demo1 {
    /*有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
    问每个月的兔子对数为多少？
    程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入到第几个月");
        int month;
        month = input.nextInt();

        /*兔子的对数*/
        int count = 0;


        /*兔子总数量*/
        int num = 0;

        for(int i = 1;i<=month;i++){
            num += count(i);

            System.out.println("第"+i+"个月有"+count(i)+"对兔子");

        }
        System.out.println("到第"+month+"个月共有"+num+"对兔子");

    }
    public static int count(int month){
        if(month == 1|| month == 2){
            return 1;
        }else{
            return count(month-1)+count(month-2);
        }


    }
}
