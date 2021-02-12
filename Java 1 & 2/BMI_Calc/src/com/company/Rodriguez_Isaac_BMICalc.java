package com.company;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Rodriguez_Isaac_BMICalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your height in inches?");

        double height = input.nextDouble();

        System.out.println("What is your weight in pounds?");

        double weight = input.nextDouble();

        double BMI = (703 * weight / (height * height));

        //Decimal Format for rounding decimals
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP); //HALF_UP Mode rounds up if decimal place being judged is .5 or higher

        if (BMI <= 18.5) {
            System.out.println("Your BMI is " + df.format(BMI) + ", Underweight");
            }
        else if (BMI > 18.5 && BMI < 25) {
            System.out.println("Your BMI is " + df.format(BMI) + ", Average Weight");
            }
        else if (BMI > 25 && BMI < 30) {
            System.out.println("Your BMI is " + df.format(BMI) + ", Overweight");
            }
        else if (BMI > 30) {
            System.out.println("Your BMI is " + df.format(BMI) + ", Obese");
            }
        }
    }