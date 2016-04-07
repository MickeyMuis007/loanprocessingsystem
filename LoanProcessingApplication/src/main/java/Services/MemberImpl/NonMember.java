package Services.MemberImpl;

import Services.Customer;

/**
 * Created by student on 2016/04/05.
 */
public class NonMember extends Customer {
    private final String type = "Non Member";
    private double fixedDepositNo;

    @Override
    public String getType() {
        return type;
    }

    public void setFixedDepositNo(double fixedDepositNo) {
        this.fixedDepositNo = fixedDepositNo;
    }
}
