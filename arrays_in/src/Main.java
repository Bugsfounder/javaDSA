//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int r2;

    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;

        // store a person's name
        String name = "Manisha";

        // Q: store 5 roll numbers
        int r1 = 23;
        int r2 = 43;
        int r3 = 73;
        int r4 = 54;

        // syntax - array
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers
        int[] r_nos = new int[5];
        // or directly
        int[] r_nos2 = {21, 43, 12, 54, 76};

        // breakdown
        int[] ros; // declaration of an array: ros is getting defined in the stack.
        ros = new int[5]; // initialization: actually here an object is created in the heap.

    }
}
