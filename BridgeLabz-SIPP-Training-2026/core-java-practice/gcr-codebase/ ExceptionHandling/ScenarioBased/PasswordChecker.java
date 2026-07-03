public class PasswordChecker {

    static void checkPassword(String password) {

        try {
            if (password == null)
                throw new NullPointerException("Password is null");

            if (password.length() == 0)
                throw new IllegalArgumentException("Empty password");

            if (password.length() < 8)
                throw new IllegalArgumentException("Too short");

            if (!Character.isUpperCase(password.charAt(0)))
                throw new IllegalArgumentException("First char must be uppercase");

            if (!Character.isDigit(password.charAt(password.length() - 1)))
                throw new IllegalArgumentException("Last char must be digit");

            if (!password.matches(".*[@#$%&*].*"))
                throw new IllegalArgumentException("Must contain special character");

            System.out.println("Strong password");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkPassword("abc123");
    }
}