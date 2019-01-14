package practice;

import java.util.Scanner;

public class demo7 {
    /*
    题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
    程序分析：利用while语句,条件为输入的字符不为'\n'.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int strCount = 0;
        int numCount = 0;
        int spaceCount = 0;
        System.out.println("输入一行字符串");
        str = input.nextLine();
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(i));
            if ((str.charAt(i) >= 97 && str.charAt(i) <= 122) || (str.charAt(i) >= 65 && str.charAt(i) <= 90)) {
                strCount++;
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                numCount++;
            } else if (str.charAt(i) == 32) {
                spaceCount++;
            }
        }
        System.out.println("字母的个数："+strCount);
        System.out.println("数字的个数："+numCount);
        System.out.println("空格的个数："+spaceCount);

    }

}
