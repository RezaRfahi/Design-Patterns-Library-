package BookTypes;

public class ReservedBook extends BookDecorator{

    ReservedBook(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + " (Reserved)";
    }

}
