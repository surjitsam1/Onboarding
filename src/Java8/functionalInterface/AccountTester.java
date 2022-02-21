package Java8.functionalInterface;

public class AccountTester {
    public static void main(String[] args) {
        float amount = 20000f;
        float interestRate = 5f;
        Account account = new Account();

        account.setInterestCalculator(new InterestCalculator() {
            @Override
            public float calculateInterestAmount(float amount, float interestRate) {
                return amount*interestRate;
            }
        });

        System.out.println(account.getInterestCalculator().calculateInterestAmount(amount, interestRate));

    }

}
