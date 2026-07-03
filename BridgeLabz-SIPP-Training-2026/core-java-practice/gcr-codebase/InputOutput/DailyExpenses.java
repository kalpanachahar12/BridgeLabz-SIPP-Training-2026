import java.io.*;
import java.util.*;

public class DailyExpenses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "expenses.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

            System.out.print("Enter number of expenses: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 0; i < n; i++) {

                System.out.print("Enter expense name: ");
                String name = sc.nextLine();

                System.out.print("Enter amount: ");
                int amount = sc.nextInt();
                sc.nextLine(); // consume newline

                String entry = name + " - " + amount;

                bw.write(entry);
                bw.newLine();
            }

            System.out.println("Expenses saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file");
        }

        sc.close();
    }
}