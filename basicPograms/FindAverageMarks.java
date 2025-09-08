package basicPograms;

public class FindAverageMarks {
    public static void main(String[] args) {
        int[] allMarks = { 90, 79, 98, 65, 76, 45 };
        double avg = 0;
        for (int marks : allMarks) {
            avg += marks;
        }
        avg /= allMarks.length;
        System.out.println(avg);
    }
}
