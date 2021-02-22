package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rodriguez_Isaac_Temperature_Converter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("What Temperature Unit (K, F, C) are you starting with? ");
			String Temp_Unit = input.nextLine().toLowerCase();

			System.out.println("Provide the amount of Degrees. ");
			double Degrees = input.nextDouble();

			DecimalFormat df = new DecimalFormat("#.##");
			df.setRoundingMode(RoundingMode.HALF_UP);

			switch (Temp_Unit) {
				case "k" -> {
					double k_f = ((Degrees - 273.15) * 9 / 5 + 32);
					double k_c = (Degrees - 273.15);
					System.out.println(Degrees + " degrees Kelvin is equivalent to " + df.format(k_c) + " degrees Celsius and " + df.format(k_f) + " degrees Fahrenheit.");
				}
				case "f" -> {
					double f_c = ((Degrees - 32) * 5 / 9);
					double f_k = ((Degrees - 32) * 5 / 9 + 273.15);
					System.out.println(Degrees + " degrees Fahrenheit is equivalent to " + df.format(f_c) + " degrees Celsius and " + df.format(f_k) + " degrees Kelvin.");
				}
				case "c" -> {
					double c_f = ((Degrees * 9 / 5) + 32);
					double c_k = (Degrees + 273.15);
					System.out.println(Degrees + " degrees Celsius is equivalent to " + df.format(c_k) + " degrees Kelvin and " + df.format(c_f) + " degrees Fahrenheit.");
				}
				default -> System.out.println("You haven't provided a usable temperature unit.");
			}

		}catch (InputMismatchException UseNumberPls) {
			System.out.println("You didn't provide a number for Degrees");
		}
	}
}