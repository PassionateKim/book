package chapter7.polymorphism.utilize;

public class Pencil extends Product{
    Pencil(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "연필";
    }
}
