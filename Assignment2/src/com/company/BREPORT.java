package com.company;


public class BREPORT {
   public void buildReport(REPORTNAME reportname, NUMBERS numbers, FIRSTNAME firstname, LASTNAME lastname) {
       System.out.println(reportname.getMyReportName());
       System.out.println(firstname.getMyFirstName() +" " + lastname.getMyLastName());
       System.out.println("Input " + "Largest" + " Smallest" + " Average" + " Total");
       System.out.println("----- " + "-------" + " --------" + " -------" + " ------");
       for (int i = 0; i<numbers.getAvgNumArr().length; i++ ){
           System.out.format("%5.5s",numbers.getInputNumArr()[i]);
           System.out.format(" %7.7s",numbers.getLargestNumArr()[i]);
           System.out.format(" %8.8s",numbers.getSmallestNumArr()[i]);
           System.out.format(" %7.7s",numbers.getAvgNumArr()[i]);
           System.out.format(" %5.5s",numbers.getTotalNumArr()[i]);
           System.out.println();
       }
       System.out.println("Grand Total: " + numbers.getGrandTotal());

    }
}