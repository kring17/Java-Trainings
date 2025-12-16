package com.bpi.M2Activity3;

public class Car { //Class
	//Car attributes: 
	String color;
	String model;
	
	//Method(action/behavior): drive()
	public void drive() {
		System.out.println("The color of the Car is:" + color + " and model is: " +model);
	}
	

	//No-Args Constructor
	public Car() {
		this.color = "Unknown";
		this.model = "Unknown";
	}   
	
	//Parameterized Constructor
	public Car(String color, String model) {
		this.color = color;
		this.model = model;
	}

	
}
