import java.util.*;

public class YoungestTallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        int minAge = 0, maxHeight = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAge]) minAge = i;
            if (height[i] > height[maxHeight]) maxHeight = i;
        }

        System.out.println("Youngest = " + name[minAge]);
        System.out.println("Tallest = " + name[maxHeight]);
    }
}