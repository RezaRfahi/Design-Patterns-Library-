package BookTypes;

public class BestsellerBook extends BookDecorator{

    public BestsellerBook(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + " (Best Seller)";
    }

    @Override
    public double getCost(){
        return decoratedBook.getCost() + 0.5;
    }
}
