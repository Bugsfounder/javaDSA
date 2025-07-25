
public class OddEven {
    public static void main(String[] args) {
        int n = 41;
        if (isOdd(n)){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }

    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
