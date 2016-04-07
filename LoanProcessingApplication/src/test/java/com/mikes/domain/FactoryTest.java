package com.mikes.domain;

import Factories.*;
import Services.Branch;
import Services.Loan;
import Services.Customer;
import Services.Report;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class FactoryTest {
    BranchFactory branchFactory;
    LoanFactory loanFactory;
    CustomerFactory customerFactory;
    ReportFactory reportFactory;
    UserFactory userFactory;

    @Before
    public void setUp() throws Exception {
        branchFactory = BranchFactory.getInstance();
        loanFactory = LoanFactory.getInstance();
        customerFactory = CustomerFactory.getInstance();
        reportFactory = ReportFactory.getInstance();
        userFactory = UserFactory.getInstance();
    }

    @Test
    public void testCapeTown() throws Exception {
        Branch branch = branchFactory.getBranch("Cape Town");
        Assert.assertEquals("Cape Town",branch.getName());
    }

    @Test
    public void testGoodwood() throws Exception {
        Branch branch = branchFactory.getBranch("Goodwood");
        Assert.assertEquals("Goodwood",branch.getName());
    }

    @Test
    public void testHeadOffice() throws Exception {
        Branch branch = branchFactory.getBranch("Head Office");
        Assert.assertEquals("Head Office",branch.getName());
    }

    @Test
    public void testCarLoan() throws Exception {
        Loan loan = loanFactory.getLoan("Car Loan");
        Assert.assertEquals(13,loan.getInterest(),0.000012);
    }

    @Test
    public void testHousingLoan() throws Exception {
        Loan loan = loanFactory.getLoan("Housing Loan");
        Assert.assertEquals(15,loan.getInterest(),0.000012);
    }

    @Test
    public void testInstantLoan() throws Exception {
        Loan loan = loanFactory.getLoan("Instant Loan");
        Assert.assertEquals(12,loan.getInterest(),0.000012);
    }

    @Test
    public void testMember() throws Exception {
        Customer customer = customerFactory.getCustomer("Member");
        Assert.assertEquals("Member",customer.getType());
    }

    @Test
    public void testNonMember() throws Exception {
        Customer customer = customerFactory.getCustomer("Non Member");
        Assert.assertEquals("Non Member",customer.getType());
    }

    @Test
    public void testComment() throws Exception {
        Report report = reportFactory.getReport("Comment");
        Assert.assertEquals("Comment",report.getType());
    }

    @Test
    public void testNotification() throws Exception {
        Report report = reportFactory.getReport("Notification");
        Assert.assertEquals("Notification",report.getType());
    }

    @Test
    public void testReminder() throws Exception {
        Report report = reportFactory.getReport("Reminder");
        Assert.assertEquals("Reminder",report.getType());
    }

    @Test
    public void testSystemReport() throws Exception {
        Report report = reportFactory.getReport("System Report");
        Assert.assertEquals("System Report",report.getType());
    }
}
