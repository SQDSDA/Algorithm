package digui;

public class digui2 {
    // void的返回要和return; 相对应
    public static void print1(int n, String aa){
        if (n == aa.length()){
            return;
        }
        print1(n+1, aa);
        System.out.println(aa.charAt(n));
    }

    public static void main(String[] args) {
        print1(0, "abbbbbccccdddd");
    }


}
