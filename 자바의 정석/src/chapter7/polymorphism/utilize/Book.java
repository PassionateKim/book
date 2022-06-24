package chapter7.polymorphism.utilize;

public class Book extends Product{
    Book(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "책";
    }
}
