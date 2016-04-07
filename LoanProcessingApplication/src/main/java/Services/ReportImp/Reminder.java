package Services.ReportImp;

import Services.Report;

/**
 * Created by student on 2016/04/06.
 */
public class Reminder extends Report {
    private String dataSent;

    public Reminder(){
        type = "Reminder";
    }
    public String send(){
        return "Reminder";
    }

    @Override
    public String getType() {
        return type;
    }
}
