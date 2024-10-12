package BookTypes;

public class ReservedBook extends BookDecorator{

    public ReservedBook(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + " (Reserved)";
    }

}
