package SOLID.DependencyInversionPrinciple.bad;

public class CreditCard {
    public void makePayment(long amount){
        System.out.println("Paying with credit card");
    }
}
