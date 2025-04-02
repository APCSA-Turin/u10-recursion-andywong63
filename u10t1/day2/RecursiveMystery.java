package u10t1.day2;

public class RecursiveMystery {
    public static void main(String [] args) {
        System.out.println(mystery(10));
    }

    // this non-void, recursive method returns an int
    public static int mystery(int num) {
        if (num >= 6) {
            return 7 + mystery(num - 2);
        } else if (num >= 2) {
            return num + mystery(num - 1);
        } else {
            return 5;
        }
    }
}