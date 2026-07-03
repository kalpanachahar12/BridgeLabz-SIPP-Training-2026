import java.io.*;
import java.util.*;

public class EmailDomain {
    public static void main(String[] args) {

        Map<String, Integer> domainCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("emails.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
 
                String domain = line.substring(line.indexOf("@") + 1);

                domainCount.put(domain,
                        domainCount.getOrDefault(domain, 0) + 1);
            }

            for (String key : domainCount.keySet()) {
                System.out.println(key + " = " + domainCount.get(key));
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}