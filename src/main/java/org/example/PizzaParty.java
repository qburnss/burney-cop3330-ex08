/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

import static java.lang.Integer.*;

public class PizzaParty {
    public static void main(String[] args){
        int realpeople, realpizzas, realslices;
        int totalslices=0, slicesper=0, remainder=0;
        System.out.println("How many people?");
        Scanner scanner = new Scanner(System.in);
        String people = scanner.next();
        System.out.println("How many pizzas do you have?");
        Scanner scanner1 = new Scanner(System.in);
        String pizzas = scanner1.next();
        System.out.println("How many slices per pizza?");
        Scanner scanner2 = new Scanner(System.in);
        String slices = scanner2.next();
        realpeople = parseInt(people);
        realpizzas = parseInt(pizzas);
        realslices = parseInt(slices);
        totalslices = realpizzas * realslices;
        slicesper = totalslices / realpeople;
        remainder = totalslices % realpeople;
        System.out.println(realpeople + " people with " +realpizzas + " pizzas " + "(" + totalslices + " slices)" );
        System.out.println("Each person gets " + slicesper + " pieces of pizza");
        System.out.println("There are " + remainder + " leftover slices");
    }
}
