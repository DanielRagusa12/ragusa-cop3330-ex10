package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int price1;
        int price2;
        int price3;
        int quantity1;
        int quantity2;
        int quantity3;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        price1=input.nextInt();

        System.out.print("Enter the quantity of item 1: ");
        quantity1=input.nextInt();

        System.out.print("Enter the price of item 2: ");
        price2=input.nextInt();

        System.out.print("Enter the quantity of item 2: ");
        quantity2=input.nextInt();

        System.out.print("Enter the price of item 3: ");
        price3=input.nextInt();

        System.out.print("Enter the quantity of item 3: ");
        quantity3=input.nextInt();

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
        System.out.print("\nTotal: $");
        System.out.format("%.2f", total);


    }
}
