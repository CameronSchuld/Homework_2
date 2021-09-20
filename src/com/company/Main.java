package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String prompt = "y";

        //Loop to run multiple times
        while((!prompt.equals("n")))
        {
            //input to get specifications
            Scanner input = new Scanner(System.in);
            System.out.println("Please use the XdY format where 'X' is the number of die\nbeing used and 'Y' is the number of sides on each die: ");
            String specs = input.next();

            //parsing the string using the char 'd'
            String[] strArray = new String[2];
            strArray = specs.split("d", 2);

            int numDice = Integer.parseInt(strArray[0]);
            int numSides = Integer.parseInt(strArray[1]);

            System.out.println("dice: " + numDice + "\nsides: " + numSides);

            //Rolling the dice
            int[]dice = new int[numDice];
            for(int i = 0; i < numDice; i++)
            {
                Random rand = new Random();
                dice[i] = rand.nextInt(numSides) + 1;
            }

            //Prints the results
            System.out.println("Results");
            for(int i = 0; i < numDice; i++)
                System.out.println((i + 1) + ": " + dice[i]);

            //Prompts to roll again
            while(true)
            {
                System.out.println("\nWould you like to roll again:");
                prompt = input.next();
                if(prompt.equals("n"))
                    break;
                else if(prompt.equals("y"))
                    break;
                else
                    System.out.println(prompt + " Is not a valid input.");
                    continue;
            }
        }


        //challenge (homework 1: write code to let the user set both number of dice and the number of sides, using XdY syntax
        //i.e., user enters 5d8, meaning five 8-sided dice
        //hint: Google Java's split() function

        //challenge (homework) 2: write code to use a while() loop to let the user continue to roll dice until they decide to stop.
        //You *do not* need to keep track of all the rolls

        //these can be done in one project
    }
}

