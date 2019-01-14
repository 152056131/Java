package practice;

public class demo10 {
    /**
     * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
     * 求它在 第10次落地时，共经过多少米？第10次反弹多高？
     */
    public static void main(String[] args) {
        /*设置初始高度*/
        double height[] = new double[11];
        /*设置共经过的距离*/
        double dis = 0;
        height[0] = 100;
        for(int i = 1;i<=height.length-1;i++){
            height[i] = height[i-1]/2;
        }
        for(int j = 1;j<=height.length - 1;j++){
            dis =dis + height[0] + height[j]*2;
        }
        System.out.println("共经过"+dis+"米");
        System.out.println("第十次反弹"+height[height.length-1]);
    }
}
