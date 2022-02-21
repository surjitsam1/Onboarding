package SOLID.DependencyInversionPrinciple.bad;

public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.purchaseItem(100);
    }
}
