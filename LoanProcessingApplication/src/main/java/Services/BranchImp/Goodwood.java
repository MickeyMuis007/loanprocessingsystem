package Services.BranchImp;

import Services.Branch;
import ValueObjects.Address;

/**
 * Created by student on 2016/04/06.
 */
public class Goodwood extends Branch {
    public Goodwood(){
        name = "Goodwood";
        Address address = new Address(77,"Alice","Goodwood","7460");
        this.address = address;
    }
    public void securityQueries(){

    }
}
