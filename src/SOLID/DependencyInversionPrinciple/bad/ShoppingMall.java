package SOLID.DependencyInversionPrinciple.bad;

public class ShoppingMall {

    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard=debitCard;
    }

    public void purchaseItem(long amount){
        debitCard.makePayment(amount);
    }
}
