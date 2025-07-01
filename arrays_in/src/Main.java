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
        // nw keyword assigns 0 value for all indexes, [0,0,0,0,....]
        System.out.println(ros[0]);
        System.out.println(ros[1]);
        System.out.println(ros[2]);

        // let's check for another datatypes
        String[] sArr = new String[4]; // in string array new, will assign null to each value with respect with indexes

        System.out.println(sArr[0]); // null

        // null can't be treated as a datatype to create a variable or anything
        // nothing will work --> error, it is just literal
//        null a = null;
//        null a = 23;
//        null a = "d";

        // we can assign null to non-primitive datatypes but can't assign to primitive datatypes
//        int inA = null; // error
        String StA = null; // no error

        // null is a special value, which can be typecast into another datatypes, [it is a value], default value for
        // reference variable, it is not a kind of datatypes


    }
}
