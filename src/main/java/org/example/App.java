package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static final double gallon=350;
    public static void main( String[] args )
    {
        int price1;
        int price2;
        int price3;
        int quantity1;
        int quantity2;
        int quantity3;


        System.out.print("Enter the price of item 1: ");
        Scanner input=new Scanner(System.in);
        price1=input.nextInt();

        System.out.print("Enter the quantity of item 1: ");
        Scanner input2=new Scanner(System.in);
        quantity1=input2.nextInt();

        System.out.print("Enter the price of item 2: ");
        Scanner input3=new Scanner(System.in);
        price2=input3.nextInt();

        System.out.print("Enter the quantity of item 2: ");
        Scanner input4=new Scanner(System.in);
        quantity2=input4.nextInt();

        System.out.print("Enter the price of item 3: ");
        Scanner input5=new Scanner(System.in);
        price3=input5.nextInt();

        System.out.print("Enter the quantity of item 3: ");
        Scanner input6=new Scanner(System.in);
        quantity3=input6.nextInt();

        int totalPrice1=price1*quantity1;
        int totalPrice2=price2*quantity2;
        int totalPrice3=price3*quantity3;
        float subtotal=totalPrice1+totalPrice2+totalPrice3;
        double tax=subtotal*.055;
        double total=tax+subtotal;

        System.out.print("Subtotal: $");
        System.out.format("%.2f", subtotal);
        System.out.print("\nTax: $");
        System.out.format("%.2f", tax);
        System.out.print("\nTotal: $");2
        System.out.format("%.2f", total);


    }
}
