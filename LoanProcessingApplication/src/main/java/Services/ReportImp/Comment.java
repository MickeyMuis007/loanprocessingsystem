package Services.ReportImp;

import Services.Report;

import java.util.Date;

/**
 * Created by student on 2016/04/06.
 */
public class Comment extends Report {
    private Date publishDate;

    public Comment(){
        type = "Comment";
    }
    public void published(){
    }

    @Override
    public String getType() {
        return type;
    }
}
