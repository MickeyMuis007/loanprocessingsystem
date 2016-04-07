package Factories;

import Services.Loan;
import Services.LoanImpl.CarLoan;
import Services.LoanImpl.HousingLoan;
import Services.LoanImpl.InstantLoan;

/**
 * Created by student on 2016/04/07.
 */
public class LoanFactory {
    static LoanFactory singleLoanFactory = new LoanFactory();
    private LoanFactory(){}
    public Loan getLoan(String loan){
        if(loan.equalsIgnoreCase("Car Loan"))
            return new CarLoan();
        else if (loan.equalsIgnoreCase("Housing Loan"))
            return new HousingLoan();
        else if (loan.equalsIgnoreCase("Instant Loan"))
            return new InstantLoan();
        else
            return null;
    }
    public static LoanFactory getInstance(){
        if (singleLoanFactory == null)
            return new LoanFactory();
        return singleLoanFactory;
    }
}
