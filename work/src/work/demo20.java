package work;

import java.util.Scanner;

public class demo20 {
    //    20、某城市出租车计费问题：Ø每日06:00-21:00，起步价6元，当日22:00-次日05:00，
// 起步价7元。Ø起步价包含2公里，超出部分按照每公里1.5元收费。
// Ø每次乘车加收1元的燃油附加税。
// 输入打车的时间和距离，计算本次打车的费用。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入乘车时间和距离（时间为24h格式）");
        int time = input.nextInt();
        double distance = input.nextFloat();
        double price = 0;
        if (distance < 0) {
            System.out.println("滚！");
        }
        if (time >= 6 && time <= 21) {
            if (distance <= 2 && distance >= 0) {
                price = 6;
            } else {
                price = 6 + ((int) (distance + 1) - 2) * 1.5 + 1;
            }
        } else if ((time >= 22 && time <= 24) || (time >= 0 && time <= 5)) {
            if (distance <= 2 && distance >= 0) {
                price = 7;
            } else {
                price = 7 + ((int) (distance + 1) - 2) * 1.5 + 1;
            }

        }




        System.out.println(price);
    }
}
