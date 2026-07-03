import java.util.*;

public class ReverseString {

    static String rev(String s) {
        if (s.length() == 0) return "";
        return rev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(rev(s));
    }
}