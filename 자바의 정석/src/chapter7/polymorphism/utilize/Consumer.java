package chapter7.polymorphism.utilize;

public class Consumer {
    int money = 10000;

    public void buy(Product product) {
        // 잔액 부족시
        if (this.money < product.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.money -= product.price;
        System.out.println(product + "를 구매하였습니다. 잔액: "+ this.money);
    }
}
