package Services;

/**
 * Created by student on 2016/04/06.
 */
public abstract class Loan {
    protected long loanReferenceNo;
    protected String loanType;
    public double loanAmount;
    public int duration;
    public void create(){

    }
    public void view(){

    }
    public void assign(){

    }
    public void edit(){

    }
    public void approve(){

    }
    public void reject(){

    }
    public void searchByRefNo(){

    }
    public abstract double getInterest();
}
