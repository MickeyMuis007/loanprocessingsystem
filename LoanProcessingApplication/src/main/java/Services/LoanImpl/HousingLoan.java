package Services.LoanImpl;

import Services.Loan;

/**
 * Created by student on 2016/04/05.
 */
public class HousingLoan extends Loan {
    private final double interest = 15.00;
    public double getInterest(){
        return interest;
    }
}
