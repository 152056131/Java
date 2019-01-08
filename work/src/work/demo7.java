package work;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        System.out.println("输入任意自然数");
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number<=0){
            System.out.println("滚");
        }else if(number ==1){
            System.out.println("1");
        }else{
            while(number!=1){
                if(number%2==0){
                    number = number/2;

                }
                else{
                    number = number*3+1;
                }
                System.out.println(number);
            }
        }
    }
}
