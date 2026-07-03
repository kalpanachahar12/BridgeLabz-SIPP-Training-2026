import java.util.Scanner;

public class Chocolates {

    static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int[] ans = distribute(chocolates, children);

        System.out.println("Each Child = " + ans[0]);
        System.out.println("Remaining = " + ans[1]);
    }
}