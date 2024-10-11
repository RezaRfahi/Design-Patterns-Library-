package BookTypes;

public abstract class BookDecorator implements Book {

    protected Book decoratedBook;

    BookDecorator(Book book) {
        this.decoratedBook = book;
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedBook.getCost();
    }
}
