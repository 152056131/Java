package work;

public class demo6 {
    public static void main(String[] args) {
        int num = 1;
        int p =2;
        int count = 0;
        while (num<=5){
            count +=p;
            p=p*10+2;
            num++;
        }
        System.out.println("2+22+222+2222+22222="+count);
    }
}
