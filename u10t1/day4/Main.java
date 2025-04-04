package u10t1.day4;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {
            System.out.print(fibonacci(i) + " ");
            System.out.print(iterativeFib(i) + " ");
            System.out.println();
        }

        int n = 40;
        long startTime = System.nanoTime();
        int fibRec = fibonacci(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;


        startTime = System.nanoTime();
        int fibIter = iterativeFib(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " + fibRec + " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + fibIter + " | Time: " + iterativeTime / 1e6 + " ms");
    }

    private static int fibonacci(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static int iterativeFib(int n) {
        int currentNum = 0;
        int prevNum = 0;
        int prev2Num = 1;
        for (int i = 1; i < n; i++) {
            currentNum = prevNum + prev2Num;
            prev2Num = prevNum;
            prevNum = currentNum;
        }
        return currentNum;
    }
}