package Factories;

import Services.Customer;
import Services.MemberImpl.Member;
import Services.MemberImpl.NonMember;

/**
 * Created by student on 2016/04/07.
 */
public class CustomerFactory {
    static CustomerFactory singleCustomerFactory = new CustomerFactory();
    private CustomerFactory(){}
    public Customer getCustomer(String member){
        if(member.equalsIgnoreCase("Member"))
            return new Member();
        else if(member.equalsIgnoreCase("Non Member"))
            return new NonMember();
        else
            return null;
    }
    public static CustomerFactory getInstance(){
        if(singleCustomerFactory == null)
            return new CustomerFactory();
        return singleCustomerFactory;
    }
}
