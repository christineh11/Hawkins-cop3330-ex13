/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principle:  ");
        int principle = input.nextInt();
        System.out.println("Enter the rate of interest: ");
        double interest = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        System.out.println("What is the number of times the interest is compounded per year? ");
        int n= input.nextInt();

        double rate=interest/100;

        //equations
        double total= principle*Math.pow(1+((rate/n)),n*years);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
                principle, interest, years, n, total);

    }
}
