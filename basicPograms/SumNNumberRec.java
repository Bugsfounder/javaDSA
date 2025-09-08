package basicPograms;

public class SumNNumberRec {
    static int sum(int n, int s) {
        if (n < 1) {
            return s;
        }
        return sum(n - 1, s + n);
    }

    static int SumIter(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 0));
        System.out.println(SumIter(10));
    }
}
