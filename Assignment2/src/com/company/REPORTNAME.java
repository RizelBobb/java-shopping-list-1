package com.company;
import java.util.Scanner;

public class REPORTNAME {
    private String myReportName;

    public String getMyReportName() {
        return myReportName;
    }

    public void giveReportName() {
        System.out.println("What is the name of the report? Do not add spaces or numbers.");
        Scanner report1 = new Scanner(System.in);
        myReportName = report1.nextLine();
        System.out.println("The report name is");
        System.out.println(myReportName);
        //no spaces or numbers should be accepted here
        if (!myReportName.matches("[a-zA-Z_]+")) {
            System.out.println("Invalid entry");
            System.out.println("Start over");
            System.exit(0);
        }
        if(myReportName == "0"){
            System.exit(0);
        }
    }
}
