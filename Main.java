package Q17InterestCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double principal, rateOfInterest, numYears;
		
		System.out.print("Enter Principal: $");
		principal = scnr.nextDouble();
		System.out.print("\nEnter Rate of Interest (As a decimal): ");
		rateOfInterest = scnr.nextDouble();
		System.out.print("\nEnter Number of Years: ");
		numYears = scnr.nextDouble();
		
		double simpleInterest = (principal * rateOfInterest * numYears);
		System.out.println("Simple Interest = $" + simpleInterest);
		

	}

}
