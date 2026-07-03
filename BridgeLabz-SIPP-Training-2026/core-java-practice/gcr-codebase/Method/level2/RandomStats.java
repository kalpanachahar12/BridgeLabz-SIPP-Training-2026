import java.util.Random;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = 1000 + r.nextInt(9000);

        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {

        int sum = 0, min = arr[0], max = arr[0];

        for (int n : arr) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        return new double[]{
                sum / (double) arr.length,
                min,
                max
        };
    }
}
