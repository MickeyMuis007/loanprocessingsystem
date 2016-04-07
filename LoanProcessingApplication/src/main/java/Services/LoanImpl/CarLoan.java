package Services.LoanImpl;

import Services.Loan;

/**
 * Created by student on 2016/04/05.
 */
public class CarLoan extends Loan {
    private final double interest = 13.00;
    public double getInterest(){
        return interest;
    }


}
