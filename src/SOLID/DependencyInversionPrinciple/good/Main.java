package SOLID.DependencyInversionPrinciple.good;

public class Main {
    public static void main(String[] args) {
        ICard card= new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(card);
        shoppingMall.purchaseItem(100);
    }
}
