package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Rodriguez_Isaac_WorldPop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a Future Calendar Year");

        int Future_Year = input.nextInt();

        int time = (Future_Year - 2021);
        BigDecimal population = new BigDecimal("7800000000");
        double e = 2.7182818284590452353602874713527;
        double rate_time = (0.0105 * time);
        double ert = Math.pow(e, rate_time);
        BigDecimal ERT = new BigDecimal(ert);

        DecimalFormat df = new DecimalFormat("#");
        System.out.println("The estimated Population of " + Future_Year + " is " + df.format(population.multiply(ERT)));
    }
}
