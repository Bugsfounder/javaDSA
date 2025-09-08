package basicPograms;

public class Fibonacci {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static double avg(int... args) {
        int sum = 0;
        for (int elem : args) {
            sum += elem;
        }
        return sum / args.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(1, 2, 3, 4, 56, 5, 6));
        System.out.println(fib(10));
    }
}
