package lecture02;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int x = 0;
        Scanner scan  = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.printf("数字%dつ目",i);
            num[i] = scan.nextInt();
            System.out.println("");
        }

        Keisan keisan = new Keisan();
        int n = keisan.sum(num);
        keisan.judge(n);
    }
}
