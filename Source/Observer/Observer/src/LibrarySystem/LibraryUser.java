package LibrarySystem;

public interface LibraryUser {
    void borrow(Borrowable item);
    void returnItem(Borrowable item);
    void viewBorrowedItems();
}
