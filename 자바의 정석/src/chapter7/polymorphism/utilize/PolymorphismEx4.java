package chapter7.polymorphism.utilize;

public class PolymorphismEx4 {
    public static void main(String[] args) {
        Book book = new Book(5000); // 5000원 짜리 book
        Pencil pencil = new Pencil(1000); // 1000원 짜리 pencil


        Consumer consumer = new Consumer(); // 소비자

        // 구매하기
        consumer.buy(book); //책를 구매하였습니다. 잔액: 5000
        consumer.buy(pencil);//연필를 구매하였습니다. 잔액: 4000
        consumer.buy(pencil);//연필를 구매하였습니다. 잔액: 3000
        consumer.buy(pencil);//연필를 구매하였습니다. 잔액: 2000
        consumer.buy(book);//잔액이 부족합니다.
    }
}
