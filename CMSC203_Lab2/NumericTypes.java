import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner input = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		
		//Task #2 declare a variable to hold the user�s temperature
		double temperature;
		
		//Task #2 prompt user to input score1 //
		System.out.println("Enter first score.");
		//Task #2 read score1 //
		score1 = input.nextInt();
		
		//Task #2 prompt user to input score2
		System.out.println("Enter second score");
		//Task #2 read score2 
		score2 = input.nextInt();
		
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = 5.0/9.0 * (BOILING_IN_F - 32.0);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.println("Enter another temperature in Fahrenheit.");
		//Task #2 read the user�s temperature in Fahrenheit
		temperature = input.nextDouble();
		//Task #2 convert the user�s temperature to Celsius
		//Task #2 print the user�s temperature in Celsius
		System.out.println(5.0/9.0 * (temperature - 32.0 ) + " Celsius");
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
