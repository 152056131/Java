package work;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
//        3、要求用户输入一个年份和一个月份，判断（要求使用嵌套的if…else和switch分别判断一次）该年该月有多少天。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = input.nextInt();
        System.out.println("请输入月份");
        int month = input.nextInt();
//        if else方法
//      if(month ==1&&month ==3&&month ==5&&month ==7&&month ==8&&month ==10&&month ==12){
//            System.out.println(year + "年的"+ month+ "月有31天");
//        }
//        else if(month ==4&&month ==6&&month ==9&&month ==11){
//            System.out.println(year + "年的"+ month+ "月有30天");
//        }
//        if((year%400==0&&year%100==0||year%100!=0&&year%4==0)&&month==2){
//            System.out.println(year + "年的"+ month+ "月有29天");
//        }
//        else{
//            System.out.println(year + "年的"+ month+ "月有28天");
//        }
//
//


//        switch方法
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(year + "年的" + month + "月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(year + "年的" + month + "月有30天");
            case 2:
                if ((year % 400 == 0 && year % 100 == 0 || year % 100 != 0 && year % 4 == 0) && month == 2) {
                    System.out.println(year + "年的" + month + "月有29天");
                } else {
                    System.out.println(year + "年的" + month + "月有28天");
                }
                break;

            default:
                break;
        }


    }
}
