import java.util.*;

public class UnitConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double km = sc.nextDouble();

        System.out.println("Miles = " + km * 0.621371);

        double miles = sc.nextDouble();

        System.out.println("Km = " + miles * 1.60934);

        double meter = sc.nextDouble();

        System.out.println("Feet = " + meter * 3.28084);

        double feet = sc.nextDouble();

        System.out.println("Meter = " + feet * 0.3048);
    }
}