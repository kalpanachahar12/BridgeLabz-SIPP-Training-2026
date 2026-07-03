import java.io.*;

public class CustomerFeedback {

    public static void main(String[] args) {
 
        String file = "feedback.txt";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            int lines = 0;

            while ((line = br.readLine()) != null && lines < 5) {

                if (line.toLowerCase().contains("good")) {
                    count++;
                }

                lines++;
            }

            System.out.println("Good Feedback Count = " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}