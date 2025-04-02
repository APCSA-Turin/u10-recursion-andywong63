package u10t1.day1;

public class RecursiveCounter {
    public static void main(String [] args) {
        recursiveCounter(1);
    }

    public static void recursiveCounter(int number) {
        System.out.println(number);
        if (number < 10) {
            recursiveCounter(number + 1);
        }
    }
}