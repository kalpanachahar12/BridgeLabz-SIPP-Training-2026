import java.io.*;

public class ProductInventory {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("inventory.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split("-");

                String product = parts[0];
                int qty = Integer.parseInt(parts[1]);

                if (qty == 0) {
                    System.out.println(product + " is out of stock");
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
