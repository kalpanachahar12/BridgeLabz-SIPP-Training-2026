import java.util.*;

public class Armstrong {

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

        
        boolean duck = false;
        for (int x : d)
            if (x == 0) duck = true;

    
        int sum = 0;
        for (int x : d)
            sum += Math.pow(x, d.length);

        boolean armstrong = sum == n;

        System.out.println("Duck = " + duck);
        System.out.println("Armstrong = " + armstrong);
    }
}