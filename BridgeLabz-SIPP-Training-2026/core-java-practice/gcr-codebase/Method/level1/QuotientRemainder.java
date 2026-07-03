import java.util.Scanner;

public class QuotientRemainder {

    static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] ans = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient = " + ans[0]);
        System.out.println("Remainder = " + ans[1]);
    }
}