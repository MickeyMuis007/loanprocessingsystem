package Services.LoanImpl;

import Services.Loan;

/**
 * Created by student on 2016/04/05.
 */
public class InstantLoan extends Loan{
    private final double interest = 12.00;
    public double getInterest(){
        return interest;
    }
}


