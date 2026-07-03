import java.util.*;

public class TempWeightVolumeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();
        System.out.println("Celsius = " + ((f - 32) * 5 / 9));

        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + ((c * 9 / 5) + 32));

        double lb = sc.nextDouble();
        System.out.println("Kg = " + (lb * 0.453592));

        double kg = sc.nextDouble();
        System.out.println("Pounds = " + (kg * 2.20462));

        double gal = sc.nextDouble();
        System.out.println("Liters = " + (gal * 3.78541));

        double l = sc.nextDouble();
        System.out.println("Gallons = " + (l * 0.264172));
    }
}