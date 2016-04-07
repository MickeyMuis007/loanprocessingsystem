package Services.BranchImp;

import Services.Branch;
import ValueObjects.Address;

/**
 * Created by student on 2016/04/06.
 */
public class HeadOffice extends Branch {
    public HeadOffice(){
        name = "Head Office";
        Address address = new Address(173,"Andrew","Belville","7343");
        this.address = address;
    }
    public void customerQueries(){

    }
    public void securityQueries(){

    }
}
