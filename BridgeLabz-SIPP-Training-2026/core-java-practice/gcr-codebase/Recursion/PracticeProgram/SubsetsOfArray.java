
public class SubsetsOfArray {

    static void subsets(int[] arr, int i, String s) {
        if (i == arr.length) {
            System.out.println(s);
            return;
        }

        subsets(arr, i + 1, s);
        subsets(arr, i + 1, s + arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        subsets(arr, 0, "");
    }
}