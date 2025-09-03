public class Main {
    // Q. string given remove all a from it
    // str = baccad, ans=bccd
    static void removeA(String ans, String remainingStr){
         if (remainingStr.isEmpty()){
             System.out.println(ans);
             return;
         }
         char  ch = remainingStr.charAt(0);
         if (ch=='a'){
             removeA(ans, remainingStr.substring(1));
         }else{
             removeA(ans+ch, remainingStr.substring(1));
         }
    }
    static String removeAReturn(String ans, String remainingStr){
         if (remainingStr.isEmpty()){
             return ans;
         }
         char  ch = remainingStr.charAt(0);
         if (ch=='a'){
             return removeAReturn(ans, remainingStr.substring(1));
         }else{
            return removeAReturn(ans+ch, remainingStr.substring(1));
         }
    }
    static String removeA(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if (ch=='a'){
            return removeA(str.substring(1));
        }
        else{
            return ch + removeA(str.substring(1));
        }
    }
    static String skipAString(String ans, String remStr){
        if (remStr.isEmpty()){
            return ans;
        }
        if (remStr.startsWith("apple")){
            return skipAString(ans, remStr.substring(5));
        }
        return skipAString(ans+remStr.charAt(0), remStr.substring(1));
    }
    static String skipStringIfNotReq(String ans, String remString){
        if (remString.isEmpty()){
            return ans;
        }
        if (remString.startsWith("app") && !remString.startsWith("apple")){
            return skipStringIfNotReq(ans, remString.substring(3));
        }else{
            return skipStringIfNotReq(ans+remString.charAt(0), remString.substring(1));
        }
    }
    public static void main(String[] args) {
        removeA("", "Manisha");
        System.out.println(removeAReturn("", "Manisha"));
        System.out.println(removeA("Manisha"));
        System.out.println(skipAString("" ,"Manishaappleraja"));
        System.out.println(skipStringIfNotReq("" ,"Mappnishaappleraja"));
    }
}
