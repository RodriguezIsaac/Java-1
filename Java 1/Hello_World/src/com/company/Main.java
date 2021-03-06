package com.company;

import java.util.Scanner;//Scanner Class aka User Input
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("This line is different from the next line. ");//Prints on the same line in the console
        System.out.println("Hello World");
        System.out.println("4 + 50");
        System.out.println(6 + 29);
        System.out.println((50 + 43) * 3);

        // todo variables need to be specified by stating: String, int, double, char(stores single characters), boolean
        String firstname = ("Isaac");
        String lastname  = ("Rodriguez");
        char letter = ('a');
        int people = 10;
        System.out.println(firstname + lastname);
        System.out.println(people);
        System.out.println(letter);

        String equation = ("7 + 3");
        double solution = (7.8 + 3);
        System.out.println("The Answer to " + equation + " is " + solution);

        //Code for User Input
        Scanner myfirstscanner =  new Scanner(System.in);// Creating a Scanner Object
        System.out.println("What is your first name? ");

        String fn = myfirstscanner.nextLine();//Reads User Input and stores info in variable

        System.out.println("What is your last name? ");

        String ln = myfirstscanner.nextLine();

        System.out.println("Hello " + fn + " " + ln);

        //Code for Conditional Statement
        Random rand = new Random();
        int x = rand.nextInt(51);
        int y = rand.nextInt(51);
        if (x > y) {
            System.out.println("x is greater than y");
            }
        else {
            System.out.println("x is not greater than y");
        }

        //Code for Looping
        for(int i = -4; i < 0; ++i) {
            System.out.println(i);
        }

        int i2 = 0;

        do {
            System.out.println(i2);
            ++i2;
        } while(i2 < 5);

    }
}
