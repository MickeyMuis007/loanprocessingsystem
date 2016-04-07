package Services;

import java.util.Date;

/**
 * Created by student on 2016/04/06.
 */
public abstract class Customer {
    private long membershipNo;
    protected String firstName;
    protected String lastName;
    protected String dateOfBirth;

    public void setMembershipNo(long membershipNo) {
        this.membershipNo = membershipNo;
    }

    public void create(){

    }
    public void edit(){

    }
    public void searchByFirstName(){

    }
    public void searchByLastName(){

    }
    public void searchByAll(){

    }
    public void searchByMembershipNo(){

    }
    public void view(){

    }
    public abstract String getType();
}
