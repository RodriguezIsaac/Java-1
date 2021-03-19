package com.company;

import java.util.Scanner;

public class Rodriguez_Isaac_PT_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompts User for input
        System.out.println("How many gallons of water do you use a month? ");
        //Takes the User's response to the prompt & converts it to a double
        double gallons = input.nextDouble();

        //Performs Equation below if gallon amount is below or equal to 25000
        if (gallons <= 25000) {
            System.out.println("Total water bill: $" + (gallons * 2.35/1000));
        }
        //Performs Equation below if gallon amount is greater than 25000 and less than or equal to 50000
        else if (25000 < gallons && gallons <= 50000) {
            System.out.println("Total water bill: $" + (25000 * 2.35/1000 + (gallons - 25000) * 6.60/1000));
        }
        //Performs Equations below if gallon amount is higher than 50000
        else if (gallons > 50000) {
            System.out.println("Total water bill: $" + (25000 * 2.35/1000 + 25000 * 6.60/1000 + (gallons - 50000) * 8.84/1000));
        }
    }
}