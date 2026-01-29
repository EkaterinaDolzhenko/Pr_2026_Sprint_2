package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items){
        this.items = items;
    }

    public double totalPrice() {
        double total = 0;
        for (Food item : items){
            total += item.totalPrice();
        }
        return total;
    }

    public double discountPrice() {
        double total = 0;
        for (Food item : items){
            total += item.discountedPrice();
        }
        return total;
    }

    public double vegPrice() {
        double total = 0;
        for (Food item : items){
            if (item.isVegetarian())
                total += item.totalPrice();
        }
        return total;
    }
}
