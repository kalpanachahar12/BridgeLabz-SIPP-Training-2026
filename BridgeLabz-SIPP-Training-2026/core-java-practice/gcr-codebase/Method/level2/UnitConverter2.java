import java.util.*;

public class UnitConverter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double yards = sc.nextDouble();
        System.out.println("Feet = " + (yards * 3));

        double feet = sc.nextDouble();
        System.out.println("Yards = " + (feet * 0.333333));

        double meters = sc.nextDouble();
        System.out.println("Inches = " + (meters * 39.3701));

        double inches = sc.nextDouble();
        System.out.println("Meters = " + (inches * 0.0254));

        double inch2 = sc.nextDouble();
        System.out.println("CM = " + (inch2 * 2.54));
    }
}
