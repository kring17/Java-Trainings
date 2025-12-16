package com.bpi.M2Activity3;

public class M2Activity3 {

	public static void main(String[] args) {
		
		//No-Args Constructor
		Car car1 = new Car();
		
		car1.color = "Pink";
		car1.model = "BMW";
		
		car1.drive();//call method
		
		//Parameterized Constructor - car.java
		Car car2 = new Car("Purple","FORD");
		
		car2.drive();//call method
		
	}
}
