import java.util.*;

public class Palindrome {

    static int[] digits(int n) {
        String s = "" + n;
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] d = digits(n);

        
        boolean pal = true;
        for (int i = 0; i < d.length / 2; i++)
            if (d[i] != d[d.length - i - 1])
                pal = false;

        
        boolean duck = false;
        for (int x : d)
            if (x == 0) duck = true;

        System.out.println("Palindrome = " + pal);
        System.out.println("Duck = " + duck);
    }
}