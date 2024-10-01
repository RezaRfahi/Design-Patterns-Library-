package LibrarySystem;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Borrowable> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
        System.out.println(((Book) item).getTitle() + " has been added to the library.");
    }

    public void showAvailableItems() {
        System.out.println("Available items in the library:");
        for (Borrowable item : items) {
            if (item.isAvailable()) {
                System.out.println(((Book) item).getTitle());
            }
        }
    }
}
