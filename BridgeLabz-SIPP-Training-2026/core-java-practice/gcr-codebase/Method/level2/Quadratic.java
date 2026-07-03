public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {

        double d = b * b - 4 * a * c;

        if (d < 0) return new double[]{};

        if (d == 0) {
            return new double[]{-b / (2 * a)};
        }

        double r1 = (-b + Math.sqrt(d)) / (2 * a);
        double r2 = (-b - Math.sqrt(d)) / (2 * a);

        return new double[]{r1, r2};
    }
}