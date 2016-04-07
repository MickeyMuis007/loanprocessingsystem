package Services;

import ValueObjects.Address;

/**
 * Created by student on 2016/04/06.
 */
public abstract class Branch {
    protected String name;
    protected Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address){

    }
}
