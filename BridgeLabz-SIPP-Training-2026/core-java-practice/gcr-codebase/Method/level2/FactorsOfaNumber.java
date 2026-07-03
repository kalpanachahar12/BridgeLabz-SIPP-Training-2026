import java.util.*;

public class FactorsOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, product = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
                product *= i;
            }
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);

        int squareSum = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                squareSum += i * i;

        System.out.println("Sum of Squares = " + squareSum);
    }
}