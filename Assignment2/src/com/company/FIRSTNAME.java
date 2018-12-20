package com.company;
import java.util.Scanner;

public class FIRSTNAME {
    public String getMyFirstName() {
        return myFirstName;
    }

    private String myFirstName;
    public void giveFirstName(){
        System.out.println ("What is your first name? Do not add spaces or numbers.");
        Scanner name1 = new Scanner (System.in);
        myFirstName = name1.nextLine();
        System.out.println ("Your first name is ");
        System.out.println (myFirstName);
        //no spaces or numbers should be accepted here
      if (!myFirstName.matches("[a-zA-Z_]+")) {
          System.out.println("Invalid entry");
          System.out.println("Start over");
          System.exit(0);
      }

  }

    public void giveDate(){
        String myDate;
        System.out.println ("What day of the week is it?");
        Scanner date1 = new Scanner (System.in);
        myDate = date1.nextLine();
        System.out.println ("Today's date is");
        System.out.println (myDate + ", Sept 2018");

        switch (myDate) {
            case "Monday":
               System.out.println("*Everyone hates Mondays*");
                break;
            case "Tuesday":
                System.out.println("*I still hate Tuesdays*");
                break;
            case "Wednesday":
                System.out.println("*Humpday*");
                break;
            case "Thursday":
                System.out.println("*Friday Jr.*");
                break;
            case "Friday":
                System.out.println("*Work ends soon*");
                break;
            case "Saturday":
                System.out.println("*Party*");
                break;
            case "Sunday":
                System.out.println("*Almost back to work =(****");
                break;
            default:
                System.out.println("You're drunk. Go home");
                break;
        }

    }

}
