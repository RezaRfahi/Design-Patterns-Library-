package LibrarySystem;

import java.util.List;
import java.util.ArrayList;

public class Member implements LibraryUser{

    private String name;
    private List<Borrowable> borrowedItems;

    public Member(String name) {
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    @Override
    public void borrow(Borrowable item) {
        if (item.isAvailable()) {
            item.borrowItem();
            borrowedItems.add(item);
        } else {
            System.out.println("This item is not available.");
        }
    }

    @Override
    public void returnItem(Borrowable item) {
        if (borrowedItems.contains(item)) {
            item.returnItem();
            borrowedItems.remove(item);
        } else {
            System.out.println("This item was not borrowed by " + name);
        }
    }

    @Override
    public void viewBorrowedItems() {
        System.out.println(name + " has borrowed the following items:");
        for (Borrowable item : borrowedItems) {
            System.out.println(((Book) item).getTitle()); // Casting to Book to get title
        }
    }
}
