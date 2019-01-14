package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class demo4 {
    /*题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        int flag = number;
        for(int i=2;i<=number;i++){
            int count = 0;
            for(int j = 1;j<=i;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count ==2){
                /*质数*/
                if(flag%i == 0){
                    flag = flag/i;
                    System.out.println(i);
                    i = 2;
                }
                if(flag == i){
                    System.out.println(i);
                }
            }

        }
    }
}
