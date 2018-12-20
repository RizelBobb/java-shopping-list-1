package com.company;


public class BuildaReport {

    public static void main(String[] args)   {
        FIRSTNAME first = new FIRSTNAME();
        first.giveFirstName();
        first.giveDate();
        LASTNAME last = new LASTNAME();
        last.giveLastName();
        REPORTNAME report = new REPORTNAME();
        report.giveReportName();
        NUMBERS nums = new NUMBERS();
        nums.calculateNums();
        BREPORT build = new BREPORT();
        build.buildReport(report, nums, first, last );


    }

}

