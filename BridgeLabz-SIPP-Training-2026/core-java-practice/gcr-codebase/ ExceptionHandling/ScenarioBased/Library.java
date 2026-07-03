public class Library {

    static int getBookLength(String[] books, int index) {
        try {
            return books[index].length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid book index!");
        } catch (NullPointerException e) {
            System.out.println("Book is null!");
        }
        return -1;
    }

    public static void main(String[] args) {

        String books[] = {"Java", "Python", null, "C++"};

        System.out.println(getBookLength(books, 2));
    }
}