package work;

public class demo18 {
//    18、编写Java程序，在控制台上打印出九九乘法表
public static void main(String[] args) {
    for(int i=1;i<=9;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+"*"+j+"="+i*j);
            System.out.print("    ");
        }
        System.out.println("");
    }
}
}
