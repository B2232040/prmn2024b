package lecture02;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        checkID check = new checkID();
        System.out.print("学籍番号を入力：");
        String ID = scan.nextLine();
        check.checkGakuseki(ID);
        System.out.print("パスワードを入力:");
        String PWD = scan.nextLine();
        check.checkPWD(ID, PWD);

    }
}
