package com.company;
import java.util.Scanner;


public class NUMBERS {

    private double[] inputNumArr;
    private double[] smallestNumArr;
    private double[] largestNumArr;
    private double[] avgNumArr;
    private double[] totalNumArr;
    private double grandTotal;

    public double[] getInputNumArr() {
        return inputNumArr;
    }

    public double[] getSmallestNumArr() {
        return smallestNumArr;
    }

    public double[] getLargestNumArr() {
        return largestNumArr;
    }

    public double[] getAvgNumArr() {
        return avgNumArr;
    }

    public double[] getTotalNumArr() {
        return totalNumArr;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void calculateNums() {
        Scanner scan = new Scanner(System.in);
        inputNumArr = new double[7];
        smallestNumArr = new double[7];
        largestNumArr = new double[7];
        avgNumArr = new double[7];
        totalNumArr = new double[7];
        grandTotal = 0;
        double avg;
        double smallest = Double.MAX_VALUE;
        double largest = Double.MIN_VALUE;
        for (int i = 0; i < inputNumArr.length; i++) {
            System.out.print("Enter a number input " + (i + 1) + " : ");
            inputNumArr[i] = scan.nextDouble();
            grandTotal += inputNumArr[i];
            avg = (grandTotal) / (i + 1);

            if (inputNumArr[i] > largest) {
                largest = inputNumArr[i];
            }
            if (inputNumArr[i] < smallest) {
                smallest = inputNumArr[i];
            }
            System.out.println("*******");
            System.out.println("Smallest Value is " + smallest);
            System.out.println("Largest Value is " + largest);
            System.out.println("You just input " + inputNumArr[i]);
            System.out.println("The total is " + grandTotal);
            System.out.println("The average is " + avg);
            System.out.println("**********");
            smallestNumArr[i] = smallest;
            largestNumArr[i] = largest;
            avgNumArr[i] = avg;
            totalNumArr[i] = grandTotal;

            if (inputNumArr[i] == 0) {
                System.exit(0);

            }

        }
    }
}