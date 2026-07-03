import java.io.*;

public class Grocery {
    public static void main(String[] args) {

        String fileName = "bill.txt";
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }

            System.out.println("Total Lines = " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}