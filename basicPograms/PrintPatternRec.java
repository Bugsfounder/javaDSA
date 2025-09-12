package basicPograms;

public class PrintPatternRec {
    static void printPattern(int n, int i){
        if (n == 0 ){
            return;
        }
        if (i == n){
            System.out.println();
            printPattern(n-1, 0);
            return;
        }
        System.out.print("*");
        printPattern(n, i+1);
    }

    static void printPatternRev(int n, int i){
        if (n==0){
            return;
        }
        if (i==n){
            printPatternRev(n-1, 0);
            System.out.println();
            return;
        }
        printPatternRev(n, i+1);
        System.out.print("*");
    }

    public static void main(String[] args) {
        printPattern(4,0);
        printPatternRev(4,0);
    }
}
