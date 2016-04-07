package Services.BranchImp;

import Services.Branch;
import ValueObjects.Address;

/**
 * Created by student on 2016/04/06.
 */
public class CapeTown extends Branch {
    public CapeTown(){
        name = "Cape Town";
        Address address = new Address(17,"Wales","Cape Town","7399");
        this.address = address;
    }
    public void customerQueries(){

    }
}
