package SOLID.DependencyInversionPrinciple.good;

public class DebitCard implements ICard {

    @Override
    public void makePayment(long amount) {
        System.out.println("Paying with debit card");
    }
}
