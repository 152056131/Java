package work;

public class demo19 {
    //    打印出100以内的质数，一行显示5个，（质数是只能被1跟自身整除的数，1不是质数）
    public static void main(String[] args) {
        int line = 0;
        int count;
        int i;
        for (i = 2; i <= 100; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.print(i);
                System.out.print("     ");
                line++;
                if (line == 5) {
                    System.out.println("");
                    line = 0;
                }
            }

        }

    }

}

