import java.util.*;

public class EmployeeSkills {

    static void findTeams(int[] arr, int i, int target,
                          List<Integer> path, int sum) {

        if (sum == target) {
            System.out.println(path);
            return;
        }

        if (i == arr.length || sum > target) return;

        
        path.add(arr[i]);
        findTeams(arr, i + 1, target, path, sum + arr[i]);

        
        path.remove(path.size() - 1);

        
        findTeams(arr, i + 1, target, path, sum);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7};
        int target = 10;

        findTeams(arr, 0, target, new ArrayList<>(), 0);
    }
}