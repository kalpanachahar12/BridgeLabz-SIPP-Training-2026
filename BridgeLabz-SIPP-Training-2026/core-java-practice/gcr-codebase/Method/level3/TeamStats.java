import java.util.*;

public class TeamStats {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] h = new int[11];

        for (int i = 0; i < 11; i++)
            h[i] = 150 + (int)(Math.random() * 101);

        int sum = 0, min = h[0], max = h[0];

        for (int x : h) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.println("Shortest = " + min);
        System.out.println("Tallest = " + max);
        System.out.println("Mean = " + (sum / 11.0));
    }
}