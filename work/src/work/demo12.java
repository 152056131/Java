package work;

public class demo12 {
    //    12、题目：一个数如果恰好等于它的因子之和，这个数就称为”完数”。例如6=1＋2＋3.编程找出1000以内的所有完数。
    public static void main(String[] args) {
        for (int x = 1; x <= 1000; x++) {
            int count = 0;
            for (int y = 1; y <= x - 1; y++) {
                if (x % y == 0) {

                    count += y;
                }
            }
            if (count == x) {
                System.out.println(x);
            }

        }
    }
}
