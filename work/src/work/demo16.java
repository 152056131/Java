package work;

import java.util.Scanner;

public class demo16 {
//    16、编写程序，设计一个图形面积计算，选择不同的图形输入数字计算面积，选择4退出程序。
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float area;
    String exit;

   do {
       System.out.println("选择需要计算图形的序号");
       System.out.println("1.长方形");
       System.out.println("2.三角形");
       System.out.println("3.圆形");
       int way = input.nextInt();
       switch (way){
           case 1:
               System.out.println("请输入相邻两条边的长度");
               float borderTop = input.nextInt();
               float borderLeft = input.nextInt();
               area = borderLeft * borderTop;
               System.out.println(area);
               break;
           case 2:
               System.out.println("请输入三条边的长度");
               float a = input.nextInt();
               float b = input.nextInt();
               float c = input.nextInt();
               if((a+b>c&&a+c>b&&b+c>a)&&(Math.abs(a-b)<c&&Math.abs(a-c)<b&&Math.abs(b-c)<a)) {
                   float p = (float) 0.5 * (a + b + c);
                   area = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
                   System.out.println(area);
               }
               else{
                   System.out.println("滚！");
               }
               break;
           case 3:
               System.out.println("请输入圆的半径");
               float r = input.nextInt();
               area = (float)Math.PI*r*r;
               System.out.println(area);
               break;
           case 4:
               break;

       }
       System.out.println("是否退出？(y/n),按任意键继续");
       exit = input.next();
   }while(exit !="y");
}
}
