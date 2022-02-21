package SOLID.DependencyInversionPrinciple.bad;

public class DebitCard {
    public void makePayment(long amount){
        System.out.println("Paying with debit card");
    }
}
