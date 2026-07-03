class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBilling {

    static void processBill(int patients[], int index, int items, int amount, int paid)
            throws InsufficientFundsException {

        try {
            int billPerItem = amount / items; // ArithmeticException possible
            System.out.println("Bill per item: " + billPerItem);

            System.out.println("Patient ID: " + patients[index]); // ArrayIndexOutOfBounds

            if (paid < amount) {
                throw new InsufficientFundsException("Payment failed: insufficient funds");
            }

            System.out.println("Payment successful");

        } catch (ArithmeticException e) {
            System.out.println("Error: Bills cannot have zero items");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index");
        }
    }

    public static void main(String[] args) {
        int patients[] = {1, 2, 3};

        try {
            processBill(patients, 5, 0, 1000, 500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}