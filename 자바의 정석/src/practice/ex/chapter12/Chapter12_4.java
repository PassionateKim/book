package practice.ex.chapter12;

import chapter7.polymorphism.utilize.Product;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Chapter12_4 {
    public static<T extends Product> ArrayList<T> merge(
            ArrayList<T> list, ArrayList<T> list2) {
        ArrayList<T> newList = new ArrayList<>(list);

        newList.addAll(list2);

        return newList;
    }
    public static void main(String[] args) {
//        ArrayList<? extends Product> a = new ArrayList<Computer>();
//        ArrayList<? extends Product> b = new ArrayList<Product>();
//        a.addAll(b);
        ArrayList<? extends Product> hapList = merge(new ArrayList<Computer>(), new ArrayList<Computer>());
    }
}

class Computer extends Product {
    Computer() {
        super(100);
    }
}


