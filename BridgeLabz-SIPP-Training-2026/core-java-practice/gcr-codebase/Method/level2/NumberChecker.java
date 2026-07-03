public class NumberChecker {

    public static int checkSign(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }
}