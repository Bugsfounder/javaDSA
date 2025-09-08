package basicPograms;

public class FloatSum {
    public static void main(String[] args) {
        float[] values = { 30.2f, 43.1f, 89.3f, 80.4f, 34.9f };
        float sum = 0.0f;
        for (float element : values) {
            sum += element;
        }
        System.out.println(sum);
    }
}
