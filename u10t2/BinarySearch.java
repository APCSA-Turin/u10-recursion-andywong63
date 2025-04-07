package u10t2;

public class BinarySearch {
    private static int recursiveCounter = -1;
    private static int nonRecursiveCounter = 0;

    public static void resetCounter() {
        recursiveCounter = -1;
        nonRecursiveCounter = 0;
    }
    public static int getRecursiveCounter() {
        return recursiveCounter;
    }
    public static int getNonRecursiveCounter() {
        return nonRecursiveCounter;
    }

    // RECURSIVE IMPLEMENTATION
    public static int recursiveBinarySearch(int[] elements, int lowPosition, int highPosition, int target) {
        recursiveCounter++;
        if (lowPosition > highPosition) {
            return -1;  // base case: target was not found, return -1
        } else {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                return recursiveBinarySearch(elements, midPosition + 1, highPosition, target);
            } else if (elements[midPosition] > target) {
                return recursiveBinarySearch(elements, lowPosition, midPosition - 1, target);
            } else {
                // otherwise, target found, return that index
                return midPosition;
            }
        }
    }

    // ITERATIVE, NON-RECURSIVE IMPLEMENTATION -- FOR COMPARISON
    public static int iterativeNonRecursiveBinarySearch(int[] elements, int target) {
        int lowPosition = 0;
        int highPosition = elements.length - 1;

        while (lowPosition <= highPosition) {
            nonRecursiveCounter++;
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                lowPosition = midPosition + 1;
            } else if (elements[midPosition] > target) {
                highPosition = midPosition - 1;
            } else {
                // else, target found, return its index
                return midPosition;
            }
        }
        // target was not found, return -1
        return -1;
    }
}