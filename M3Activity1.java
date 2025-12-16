package com.bpi.M3Activity1;
import java.util.*;

public class M3Activity1 {

	public static void main(String[] args) {

	// 1. Create a List of Products with 5 records
		List<String> products = new ArrayList<>();
			
			products.add("Laptop");
			products.add("Mouse");
			products.add("Keyboard");
			products.add("Monitor");
			products.add("Printer");
			
	// 2. Print all products
		System.out.println("All products:");
		printProducts(products);
			
	// 3. Add a new product (Webcam)
		products.remove("Webcam");
	// remove one product (Mouse)
		products.add("Mouse");
			
		System.out.println("After adding and removing products:");
		printProducts(products);
			
	// 4. Find a product by name using two ways
		Scanner in = new Scanner(System.in);
		System.out.print("Enter product name to search: ");
		String searchProduct = in.nextLine();
			
	// 4.1 Traditional for-loop
		boolean found = false;
		for (String product : products) {
			if (product.equalsIgnoreCase(searchProduct)) {
				found = true;
		break; }
		}
			if (found) {
			    System.out.println("Product found: " + searchProduct);
			} else {
			    System.out.println("Product not found");
			}
			
	// 4.2 Using contains() method
		System.out.println("Using contains() method:");
		if (products.contains(searchProduct)) {
			System.out.println("Product found: " + searchProduct);
		} else {
			System.out.println("Product not found");
			   }
		in.close();
		}

	private static void printProducts(List<String> products) {
		int index = 1;
		for (String product : products) {
		System.out.println(index++ + ". " + product);
		}
			
	}
	
}
