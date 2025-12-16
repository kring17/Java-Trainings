package com.bpi.M1Activity5;

public class Activity5 {

	public static void main(String[] args) {
		int result = calculateSum(1,50);
		System.out.println("Sum = " + result);
        

	}
	
	public static int calculateSum(int a, int b) {
		int sum = 0;

		for (int i = a; i <= b; i++) {
            sum += i;
        }
		
		return sum;

}

}