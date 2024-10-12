package BookTypes;

public class PremiumBook extends BookDecorator {

    public PremiumBook(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + " (Premium)";
    }

    @Override
    public double getCost() {
        return decoratedBook.getCost() + 10 / 5;
    }
}
