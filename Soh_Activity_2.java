/**
 * 
 */
package com.bpi.helloworld.main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter your age: ");
		String age = input.nextLine();
		
		int ageint = Integer.parseInt(age);
		double agedouble = Double.parseDouble(age);
		
		System.out.println("Your age as int: " + ageint );
		
		System.out.println("Your age as double: " + agedouble );
	}

}
