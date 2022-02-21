package SOLID.DependencyInversionPrinciple.good;

public class ShoppingMall {
    private ICard card;

    public ShoppingMall(ICard card) {
        this.card=card;
    }

    public void purchaseItem(long amount){
        card.makePayment(amount);
    }
}
