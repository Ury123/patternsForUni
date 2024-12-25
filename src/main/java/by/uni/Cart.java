package by.uni;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static Cart instance;
    private final List<String> items;

    private Cart() {
        items = new ArrayList<>();
    }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void showCart() {
        System.out.println("Cart items: " + items);
    }

    public void clearCart() {
        items.clear();
        System.out.println("Cart is cleared.");
    }
}
