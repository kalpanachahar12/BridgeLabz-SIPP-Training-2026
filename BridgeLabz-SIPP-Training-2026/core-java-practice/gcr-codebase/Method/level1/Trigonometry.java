import java.util.Scanner;

public class Trigonometry {

    static double[] calculateTrigonometricFunctions(double angle) {

        double rad = Math.toRadians(angle);

        return new double[]{
                Math.sin(rad),
                Math.cos(rad),
                Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();

        double[] ans = calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + ans[0]);
        System.out.println("Cos = " + ans[1]);
        System.out.println("Tan = " + ans[2]);
    }
}