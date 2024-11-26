package lecture02;

public class Keisan {

    public int sum(int[] array){
        int x = 0;
        for (int j = 0; j < 5; j++) {
            x += array[j];
        }
        System.out.printf("合計値：%d\n", x);
        return x;
    }

    public void judge(int x){
        if(x >= 100){
            System.out.printf("great!!");
        }else if(x >= 50){
            System.out.printf("big");
        }else{
            System.out.printf("small");
        }
    }
}
