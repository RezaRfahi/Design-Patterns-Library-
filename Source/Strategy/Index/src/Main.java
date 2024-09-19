import FeeCalculation.*;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new LibraryItem("The Great Gatsby", new BookLateFee());
        System.out.println("Late fee for book: $" + book.calculateLateFee(35)); // 35 days late

        LibraryItem dvd = new LibraryItem("Inception", new DVDLateFee());
        System.out.println("Late fee for DVD: $" + dvd.calculateLateFee(18)); // 18 days late

        LibraryItem magazine = new LibraryItem("Time Magazine", new MagazineLateFee());
        System.out.println("Late fee for magazine: $" + magazine.calculateLateFee(10)); // 10 days late
    }
}