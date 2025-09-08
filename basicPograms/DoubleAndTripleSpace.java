package basicPograms;

public class DoubleAndTripleSpace {
    public static void main(String[] args) {
        String str = "Manisha    is a      good    girl.";
        System.out.println(str.contains("  "));
        System.out.println(str.contains("   "));
    }
}
