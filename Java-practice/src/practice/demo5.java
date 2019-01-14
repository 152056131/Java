package practice;

import java.util.Scanner;

public class demo5 {
    /*  题目：利用条件运算符的嵌套来完成此题：
        学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
        程序分析：(a>b)?a:b这是条件运算符的基本例子
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade;
        String op;
        String lelve;
        while (true){
            System.out.println("请输入分数");
            grade = input.nextDouble();
            lelve = grade(grade);
            if(lelve.equals("")){
                System.out.println("你输入的成绩有误，请重新输入");
            }else{
                System.out.println("该同学的成绩为："+lelve);
            }
            System.out.println("是否继续？（Y/N）");
            op = input.next();
            if(!op.equals("Y")){
                return;
            }


        }
    }


    public static String grade(double grade){
        String lelve = "";
       if(grade >=90&&grade<=100){
           lelve = "A";
       }else if(grade>=60&&grade<=89){
           lelve = "B";
       }else if(grade<60&&grade>=0){
           lelve = "C";
       }
       return lelve;
    }
}
