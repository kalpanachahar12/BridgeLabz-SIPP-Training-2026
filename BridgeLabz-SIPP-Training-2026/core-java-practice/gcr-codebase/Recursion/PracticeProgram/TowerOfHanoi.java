import java.util.*;

public class TowerOfHanoi{

    static void toh(int n, char a, char b, char c) {
        if (n == 0) return;

        toh(n - 1, a, c, b);
        System.out.println("Move disk " + n + " from " + a + " to " + c);
        toh(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n, 'A', 'B', 'C');
    }
}
