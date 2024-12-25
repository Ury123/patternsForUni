package by.uni;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        // Работа с корзиной через "Одиночку"
        Cart cart = Cart.getInstance();
        cart.addItem("Pizza");
        cart.addItem("Burger");
        cart.addItem("Coke");
        cart.showCart();

        // Выбор способа оплаты через "Стратегию"
        PaymentContext paymentContext = new PaymentContext();

        System.out.println("\nSelecting cash payment:");
        paymentContext.setPaymentStrategy(new CashPayment());
        paymentContext.executePayment(25.99);

        System.out.println("\nSelecting card payment:");
        paymentContext.setPaymentStrategy(new CardPayment());
        paymentContext.executePayment(25.99);

        // Очистка корзины
        cart.clearCart();
    }
}
