package practice.ex.chapter7;

public class Chapter7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv()); // 900
        b.buy(new Computer());// 700
        b.buy(new Tv()); // 600
        b.buy(new Audio()); // 550
        b.buy(new Computer()); // 350
        b.buy(new Computer()); // 150
        b.buy(new Computer()); // -> -50

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }//buy

    void add(Product product) {
        if (i >= cart.length) {
            Product[] newCart = new Product[cart.length * 2];
            System.arraycopy(cart, 0, newCart, 0, cart.length);
            cart = newCart;
        }
        cart[i++] = product;
    }//add

    void summary() {
        String tmp = "";
        for (Product product : cart) {
            if (product == null) {
                break;
            }
            tmp += product + ",";
        }
        System.out.println("구입한 물건:" + tmp);
        System.out.println("사용한 금액:" + (1000-money));
        System.out.println("남은 금액:" + money);
    }//summary
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}