public class MovieSeat {

    static int getSeat(int[] seats, int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat index!");
            return -1;
        }
    }

    public static void main(String[] args) {

        int seats[] = {101, 102, 103, 104, 105};

        System.out.println(getSeat(seats, 8));
    }
}