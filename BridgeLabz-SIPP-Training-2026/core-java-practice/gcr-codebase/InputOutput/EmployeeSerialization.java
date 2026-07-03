import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.employeeId = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, dept, salary);

            // Serialization
            FileOutputStream fos = new FileOutputStream("employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();

            System.out.println("Employee Serialized Successfully");

        
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("employee.txt"));

            Employee e = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nRecovered Data:");
            System.out.println(e.employeeId + " " + e.name + " " +
                    e.department + " " + e.salary);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}