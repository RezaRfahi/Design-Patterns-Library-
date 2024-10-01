import LibrarySystem.*;

public class Main {
    public static void main(String[] args) {
        // Creating a library and some books
        Library library = new Library();
        Borrowable book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Borrowable book2 = new Book("1984", "George Orwell");

        // Adding items to the library
        library.addItem(book1);
        library.addItem(book2);

        // Creating a member
        LibraryUser member = new Member("Alice");

        // Display available items
        library.showAvailableItems();

        // Borrowing items
        member.borrow(book1);
        member.viewBorrowedItems();
        library.showAvailableItems();  // Shows remaining available books

        // Returning an item
        member.returnItem(book1);
        member.viewBorrowedItems();
        library.showAvailableItems();  // Shows all books are available again

    }
}