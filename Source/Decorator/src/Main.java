import BookTypes.*;

public class Main {
    public static void main(String[] args) {
        // Creating a basic book
        Book basicBook = new BasicBook("Design Patterns", 30.0);

        // Decorating the book: Reserving the book
        Book reservedBook = new ReservedBook(basicBook);
        System.out.println(reservedBook.getDescription() + " $" + reservedBook.getCost());

        // Decorating the reserved book as a bestseller
        Book bestsellerReservedBook = new BestsellerBook(reservedBook);
        System.out.println(bestsellerReservedBook.getDescription() + " $" + bestsellerReservedBook.getCost());

        // Decorating the book with premium status
        Book premiumBestsellerReservedBook = new PremiumBook(bestsellerReservedBook);
        System.out.println(premiumBestsellerReservedBook.getDescription() + " $" + premiumBestsellerReservedBook.getCost());
    }
}