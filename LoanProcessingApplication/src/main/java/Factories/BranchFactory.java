package Factories;

import Services.Branch;
import Services.BranchImp.CapeTown;
import Services.BranchImp.Goodwood;
import Services.BranchImp.HeadOffice;

/**
 * Created by student on 2016/04/07.
 */
public class BranchFactory {
    private static BranchFactory singleBranchFactory = new BranchFactory();
    private BranchFactory(){}
    public Branch getBranch(String branch){
        if(branch.equalsIgnoreCase("Cape Town"))
            return new CapeTown();
        else if(branch.equalsIgnoreCase("Goodwood"))
            return new Goodwood();
        else if(branch.equalsIgnoreCase("Head Office"))
            return new HeadOffice();
        else
            return null;
    }
    public static BranchFactory getInstance(){
        if(singleBranchFactory == null)
            return new BranchFactory();
        return singleBranchFactory;
    }
}
