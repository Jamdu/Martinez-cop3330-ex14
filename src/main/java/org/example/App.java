/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Martinez
 */
package org.example;


import java.util.Scanner;

public class App
{
    static final double taxRate = 5.5;
    public static void main( String[] args )
    {

        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        double orderAmount = scnr.nextInt();

        System.out.println("What is the state? ");
        String state = scnr.next();

        System.out.println("In " + state);

        if (state.equals("WI"))
        {
            System.out.format("The Subtotal is $%.2f\n", orderAmount);

            double percent = taxRate / 10;
            System.out.format("The Tax is $%.2f \n", percent);

            orderAmount += percent;
            System.out.format("The total is $%.2f", orderAmount);
            System.exit(0);
        }
        System.out.println("The total is $" + orderAmount + ".");
    }
}
