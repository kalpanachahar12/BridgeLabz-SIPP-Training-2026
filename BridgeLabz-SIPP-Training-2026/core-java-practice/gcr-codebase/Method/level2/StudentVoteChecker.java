import java.util.*;

public class StudentVoteChecker{

    static boolean canVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < 10; i++)
            age[i] = sc.nextInt();

        for (int a : age)
            System.out.println(a + " -> " + (canVote(a) ? "Can Vote" : "Cannot Vote"));
    }
}