package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 8 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "How many people? " );
        String stringPeople = scan.nextLine();
        System.out.print( "How many pizzas do you have? " );
        String stringPizza = scan.nextLine();
        System.out.print( "How many slices per pizza? " );
        String stringSlices  = scan.nextLine();

        int people = Integer.parseInt(stringPeople);
        int pizza = Integer.parseInt(stringPizza);
        int slices = Integer.parseInt(stringSlices);

        int totalslices = pizza * slices;
        int perperson = totalslices / people;
        int remainder = totalslices % people;

        System.out.println(stringPeople+" people with "+stringPizza+" pizzas ("+totalslices+" slices)");
        System.out.println("Each person gets "+perperson+" pieces of pizza.");
        System.out.println("There are "+remainder+" leftover pieces.");
    }
}