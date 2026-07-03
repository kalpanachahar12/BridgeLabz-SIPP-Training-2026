import java.util.*;

public class Harshad {

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

        int sum = 0;
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int x : d) {
            sum += x;
            freq[x][1]++;
        }

        System.out.println("Harshad = " + (n % sum == 0));

        for (int i = 0; i < 10; i++)
            System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }
}