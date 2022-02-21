package SOLID.SingleResponsibilityPrinciple.good;

public class LoanService {
    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("home")){
            // get interest info for home loan
        }

        if(loanType.equals("personal")){
            // get interest info for personal loan
        }

        if(loanType.equals("auto")){
            // get interest info for auto loan
        }
    }
}
