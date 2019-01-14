package practice;

import java.util.Scanner;

public class demo6 {
    /*
    题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
    程序分析：利用辗除法。*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.println("请输入两个数");
        m = input.nextInt();
        n = input.nextInt();
        gcd(m,n );
        lcm(m,n );
    }


    /*最大公约数*/
    public static void gcd(int m, int n) {
        int min = m < n ? m : n;
        for (int i = min; i >=1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(m+","+n+"的最大公约数为："+i);
                return;
            }
        }
    }
    /*最小公倍数*/
    public static void lcm(int m,int n){
        int max = m>n?m:n;
        int min = m<n?m:n;
        for(int i=1;i<=n;i++){
            if((i*max)%min == 0){
                System.out.println(m+","+n+"的最小公倍数为："+i*max);
                return;
            }
        }
    }
}
