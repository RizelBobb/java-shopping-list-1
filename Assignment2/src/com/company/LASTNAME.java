package com.company;
import java.util.Scanner;

public class LASTNAME{
        //Scanner example
        private String myLastName;

    public String getMyLastName() {
        return myLastName;
    }

    public void giveLastName(){

            Scanner scan = new Scanner(System.in);
            System.out.print("How many letters in your last name? ");
            int numOfLetters = Integer.parseInt(scan.nextLine());
            String lastNameArray[] = new String[numOfLetters];
            for (int i = 0; i < lastNameArray.length; i++) {
                    lastNameArray[i] = scan.nextLine();
                if (!lastNameArray[i].matches("[a-zA-Z_]+")) {
                    System.out.println("No special characters, numbers, nor spaces");
                    System.out.println("Start over");
                    System.exit(0); }
                if (lastNameArray[i].length() > 2) {
                    System.out.println("Only one letter at a time");
                    System.out.println("Start over");
                    System.exit(0); }

           }
            String[] lastNameArr= lastNameArray;
            StringBuilder strBuilder = new StringBuilder();
            for (int i = 0; i < lastNameArr.length; i++) {
                strBuilder.append(lastNameArr[i]);
            }
             myLastName = strBuilder.toString();
            System.out.println(myLastName);

        }

    }



