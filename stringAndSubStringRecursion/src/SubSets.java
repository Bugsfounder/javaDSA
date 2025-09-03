import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSets {
    public static void main(String[] args) {
//        subseq("", "abc");
        subseqAscii("", "abc");
//        System.out.println(subseqRetArr("", "abc"));
        System.out.println();
        ArrayList<String> anss = new ArrayList<>();
//        subseqRetArrArg("", "abc", anss);
        subseqRetArrAscii("", "abc", anss);
        System.out.println(anss);
    }

    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqRetArr(String p , String up){
        ArrayList<String> ans = new ArrayList<>();
        if (up.isEmpty()){
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        ans.addAll(subseqRetArr(p+ch,up.substring(1)));
        ans.addAll(subseqRetArr( p, up.substring(1)));
        return ans;
    }

    static void subseqRetArrArg(String p , String up, ArrayList<String> ans){
        if (up.isEmpty()){
            return;
        }
        char ch = up.charAt(0);
        ans.addAll(subseqRetArr(p+ch,up.substring(1)));
        ans.addAll(subseqRetArr( p, up.substring(1)));
    }
    static void subseqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
        subseq(p+(ch+0), up.substring(1));
    }
    static void subseqRetArrAscii(String p , String up, ArrayList<String> ans){
        if (up.isEmpty()){
            return;
        }
        char ch = up.charAt(0);
        ans.addAll(subseqRetArr(p+ch,up.substring(1)));
        ans.addAll(subseqRetArr( p, up.substring(1)));
        ans.addAll(subseqRetArr( p + (ch+0), up.substring(1)));
    }
}
