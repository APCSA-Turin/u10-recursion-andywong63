package u10t1.day4.warmup;

public class StringMystery {
    public static void main(String[] args) {
        mystery(5);
    }

    public static void mystery(int num) {
        if (num == 1) {
            return;
        }
        System.out.println(num);
        mystery(num - 1);
        for (int i = num; i >= 0; i--) {
            System.out.print(i);
        }
        System.out.println();
    }
}