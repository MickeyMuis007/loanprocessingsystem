package Factories;

import Services.Report;
import Services.ReportImp.Comment;
import Services.ReportImp.Notification;
import Services.ReportImp.Reminder;
import Services.ReportImp.SystemReport;

/**
 * Created by student on 2016/04/07.
 */
public class ReportFactory {
    static ReportFactory singleReportFactory = new ReportFactory();
    private ReportFactory(){}
    public Report getReport(String report){
        if(report.equalsIgnoreCase("Comment"))
            return new Comment();
        else if(report.equalsIgnoreCase("Notification"))
            return new Notification();
        else if(report.equalsIgnoreCase("Reminder"))
            return new Reminder();
        else if(report.equalsIgnoreCase("System Report"))
            return new SystemReport();
        else
            return null;
    }
    public static ReportFactory getInstance(){
        if(singleReportFactory == null)
            return new ReportFactory();
        return singleReportFactory;
    }
}
