package com.bpi.M3Activity2;
import java.util.*;

public class M3Activity2 {

	public static void main(String[] args) {
	
		HashSet<String> products = new HashSet<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		products.add("Speaker");
		
		Scanner in = new Scanner(System.in);
		int choice;
		
		do {
			//Display Menu
			System.out.println("Select an option: ");
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products and count");
			System.out.println("4. Exit");
			System.out.print("> ");
			choice = in.nextInt();
			in.nextLine();
			
			switch (choice) {
			case 1: //Search Product
				System.out.println("Enter a product name to search:");
				String searchProduct = in.nextLine();
				
				if 
					(products.contains(searchProduct)) {
                    System.out.println("Product found: " + searchProduct);
                } 
				else {
                    System.out.println("Product not found!");
                }
            break;

			case 2: // Add a product
				System.out.print("Enter product name to add: ");
                String newProduct = in.nextLine();
                    
                if (products.add(newProduct)) {
                	System.out.println("Product added: " + newProduct);
                } 
                else {
                	System.out.println("Product already exists!");
                    }
            break;

			case 3: // Print all products and count 
				System.out.println("All products:");
                for (String product : products) {
                    System.out.println(product);
                }
                System.out.println("Total unique products: " + products.size());
            break;

			case 4: // Exit
               	System.out.println("Exiting...");
            break;

            default:
            	System.out.println("Invalid option! Please try again.");
            }
			
        } 
		while (choice != 4);

        in.close();
    }
}

