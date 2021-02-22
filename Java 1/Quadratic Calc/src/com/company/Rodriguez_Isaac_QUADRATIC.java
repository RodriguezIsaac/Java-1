package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Rodriguez_Isaac_QUADRATIC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a value for a. ");

        try {
            double a = input.nextDouble();

            System.out.println("Please provide a value for b. ");
            double b = input.nextDouble();

            System.out.println("Please provide a value for c. ");
            double c = input.nextDouble();

            double ans = ((-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a));
            double ans1 = ((-b - Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a));

            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.HALF_UP);

            if (ans == ans1) {
                System.out.println("Only One Solution:\n" + df.format(ans));
            }
            else {
                System.out.println("Answers: \nx = " + df.format(ans) + "\nx = " + df.format(ans1));
            }
        }catch (InputMismatchException UseNumberPls) {
            System.out.println("You Didn't Provide a Number :/");
        }catch (ArithmeticException DivisionByZero) {
            System.out.println("You Can't Divide by Zero.");
        }
    }
}