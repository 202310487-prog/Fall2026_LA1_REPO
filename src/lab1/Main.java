package lab1;

/**
 * Starter class for Lab Assignment 1 (Fall 2026).
 * Add a println statement with your name in the main method.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Software Evolution and Maintenance - Lab 1");
		System.out.println("Temperature of 25 C in Fahrenheit: " + celsiusToFahrenheit(25));
	}

	/** Converts degrees Celsius to degrees Fahrenheit. */
	public static double celsiusToFahrenheit(double c) {
		return c * 9.0 / 5.0 + 32.0;
	}
}
