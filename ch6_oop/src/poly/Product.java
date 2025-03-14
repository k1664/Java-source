package poly;

import java.security.PublicKey;

public class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {

    public Tv() {
        super(1000);
    }

    @Override
    public String toString() {
        return "TV";
    }
}

class Computer extends Product {

    public Computer() {
        super(2000);
    }

    @Override
    public String toString() {
        return "computer";
    }
}

class Audio extends Product {

    public Audio() {
        super(500);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}