package work;

public class demo5 {
    public static void main(String[] args) {
        int count=0;
        int i = 1;
        while(i<=100){
            count = count + i;
            i +=2;
        }
        System.out.println("1-100的所有奇数和为："+ count);
    }
}
