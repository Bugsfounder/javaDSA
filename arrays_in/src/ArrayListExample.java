import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList<Integer> list_f = new ArrayList<Integer>(10); // --> this will work, 10 doesn't matter, it 10 is given still
//                                                                          we can insert as many elements  i want into this list
//        ArrayList list_g = new ArrayList<Integer>(); // --> this will also work but not good practice
        ArrayList<Integer> list = new ArrayList<>();

        list.add(67);
        list.add(54);
        list.add(34);
        list.add(23);
        list.add(77);
        list.add(897);
        list.add(6);
        list.add(27);
        list.add(68);

        System.out.println(list.contains(34));

        list.set(0, 99); // 0 -> index, 99 --> value

        list.remove(4);
        System.out.println(list);

        Scanner in = new Scanner(System.in);
        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index --> [0] not valid
//        for (int i = 0; i < list.size(); i++) {
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass index here, passing [index] is not work here
        }
        System.out.println();
        System.out.println(list);
    }
}
