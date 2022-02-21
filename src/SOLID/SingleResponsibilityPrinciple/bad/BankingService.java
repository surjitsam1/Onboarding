package SOLID.SingleResponsibilityPrinciple.bad;

public class BankingService {
    public long deposit(String accountNo, long amount){
        // deposit amount
        return 0;
    }

    public long withdraw(String accountNo, long amount){
        // withdraw amount
        return 0;
    }

    public void printPassbook(){
        // print passbook
    }

    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("home")){
            // get interest info for home loan
        }

        if(loanType.equals("personal")){
            // get interest info for home loan
        }

        if(loanType.equals("auto")){
            // get interest info for home loan
        }
    }

    public void sendOTP(String mode){
        if(mode.equals("email")){
            // send email
        }

        if(mode.equals("sms")){
            // send sms
        }


    }
}
