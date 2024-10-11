package BookTypes;

public class BasicBook implements Book{

    private String title;
    private double price;

    BasicBook(String title, double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return title;
    }

    @Override
    public double getCost() {
        return price;
    }
}
