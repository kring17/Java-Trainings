package com.bpi.activities.main;
import java.util.*;

public class Main {

	public static void compute( int num1,int num2) {
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		
		System.out.println("Sum: " + sum );
		System.out.println("Difference: " + difference );
		System.out.println("Product: " + product );
	}
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter your first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter your second integer: ");
		int num2 = input.nextInt();
		
		compute(num1,num2);
		


	}

}
