import FeeCalculation.*;

public class Main {
    public static void main(String[] args) {
        BookLateFee book = new BookLateFee();
        System.out.println(book.getMaxLateFee());
    }
}