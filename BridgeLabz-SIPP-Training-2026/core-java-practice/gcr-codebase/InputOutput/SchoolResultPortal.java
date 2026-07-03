import java.io.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "report.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(" ");

                String name = data[0];
                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double avg = total / 3.0;

                String result = name + " Average = " + avg;

                System.out.println(result);
                bw.write(result);
                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found");

        } catch (IOException e) {
            System.out.println("Error reading/writing file");
        }
    }
}