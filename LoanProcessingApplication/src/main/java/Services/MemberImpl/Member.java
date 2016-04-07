package Services.MemberImpl;


import Services.Customer;

/**
 * Created by student on 2016/04/05.
 */
public class Member extends Customer {
    private final String type = "Member";

    @Override
    public String getType() {
        return type;
    }
}
