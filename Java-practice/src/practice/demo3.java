package practice;

public class demo3 {
    /*题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
    例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
  程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。*/
    public static void main(String[] args) {
        boolean flag;
        for(int i = 100;i<=999;i++){
            flag = narcissisticNumber(i);
            if(flag){
                System.out.println(i);
            }
        }

    }
public static boolean narcissisticNumber(int number){
        boolean flag = true;
        int hundred = number/100;
        int decade = (number%100)/10;
        int unit = number%10;
        if(number == hundred*hundred*hundred+decade*decade*decade+unit*unit*unit){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
}

}
