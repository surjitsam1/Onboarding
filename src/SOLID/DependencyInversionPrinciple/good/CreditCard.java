package SOLID.DependencyInversionPrinciple.good;

public class CreditCard implements ICard {

    @Override
    public void makePayment(long amount) {
        System.out.println("Paying with credit card");
    }
}
