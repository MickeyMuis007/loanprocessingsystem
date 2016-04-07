package Services.ReportImp;

import Services.Report;

/**
 * Created by student on 2016/04/06.
 */
public class SystemReport extends Report {
    public SystemReport(){
        type = "System Report";
    }
    public void view(){

    }
    public void print(){

    }

    @Override
    public String getType() {
        return type;
    }
}
