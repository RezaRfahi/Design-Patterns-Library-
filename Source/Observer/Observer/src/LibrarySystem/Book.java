package LibrarySystem;

public class Book implements Borrowable{

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // New books are available by default
         }

    public String getTitle() {
        return title;
    }

    @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available for borrowing.");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    @Override
    public boolean isAvailable() {
        return this.isAvailable;
    }
}
