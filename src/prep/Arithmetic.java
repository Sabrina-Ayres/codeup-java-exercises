package prep;

public class Arithmetic {


    public static int square(int x) {
        return x * x;
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int difference(int x, int y) {
        return x - y;
    }

    public static int product(int x, int y) {
        return x * y;
    }   // Can use double

    public static double average(int[] arr) {   // Must do double
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        return average;
    }

}
