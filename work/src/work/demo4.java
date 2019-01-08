package work;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
//        4、要求用户输入一个学生的分数（1~100），使用switch结构判断该分数属于什么等级（A、B、C、D、F）。
        Scanner input = new Scanner(System.in);
        float score = input.nextInt();
//        A等级90-100
//        B等级80-90
//        C等级70-80
//        D等级60-70
//        F等级60以下

        int scorePer = (int) score / 10;
        if (score >= 0 && score <= 100) {
            switch (scorePer) {
                case 10:
                    System.out.println("A等级");
                    break;
                case 9:
                    System.out.println("B等级");
                    break;
                case 8:
                    System.out.println("C等级");
                    break;
                case 7:
                    System.out.println("D等级");
                    break;
                default:
                    System.out.println("F等级");
                    break;
            }
        } else {
            System.out.println("滚！");
        }
    }
}
