/**
 * 
 */
package com.bpi.helloworld.main;
import java.util.*;

public class Main {


	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 
		System.out.print("Age: " );
		int age = input.nextInt();
		
		
		if (age < 18) {
		System.out.println("Minor");
		}
		else if (age >= 18 && age < 60 ) {
			System.out.println("Adult");
		}
		else  {
			System.out.println("Senior");
		}
		
	}

}
