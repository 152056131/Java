package practice;

public class demo9 {
    /**题目：一个数如果恰好等于它的因子之和，
     * 这个数就称为"完数"。
     * 例如6=1＋2＋3.编程找出1000以内的所有完数。*/
    public static void main(String[] args) {
        System.out.println("1000以内所有的完数有：");
            for (int i = 1;i<=1000;i++){
                int count = 0;
                for(int j = 1;j<=i-1;j++){
                    if(i%j == 0){
                        count +=j;
                    }
                }
                if(count ==i){
                    System.out.println(i);
                }
            }
    }
}
