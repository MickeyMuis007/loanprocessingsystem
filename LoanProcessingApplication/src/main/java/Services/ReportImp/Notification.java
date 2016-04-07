package Services.ReportImp;

import Services.Report;

/**
 * Created by student on 2016/04/06.
 */
public class Notification extends Report {
    private String dataSent;

    public Notification(){
        type = "Notification";
    }
    public void send(){

    }

    @Override
    public String getType() {
        return type;
    }
}
