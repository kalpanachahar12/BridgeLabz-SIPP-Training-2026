public class Quiz {

    public static void main(String[] args) {

        String answers[] = {"A", "B", "C", "D"};

        for (int i = 0; i <= answers.length; i++) {
            try {
                if (answers[i].equals("A")) {
                    System.out.println("Correct at " + i);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Skipping invalid index: " + i);
            } catch (NullPointerException e) {
                System.out.println("Null answer at " + i);
            }
        }
    }
}