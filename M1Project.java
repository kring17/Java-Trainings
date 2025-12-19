package com.bpi.M1Project;
import java.util.*;
public class M1Project {
	
    static String name = "";
    static String studentId = "";
    static double average = 0.0;

    public static void displayMenu() {
        System.out.println("==== STUDENT GRADING SYSTEM ====");
        System.out.println("A - Add Student Information");
        System.out.println("B - Compute Student Average");
        System.out.println("C - Display Student Information");
        System.out.println("D - Exit");
        System.out.print("Choose an option: ");
        
    }
 
    // Collect student info and compute sum of grades immediately
    public static double studentInformation(Scanner in) {
        System.out.println("==== STUDENT INFORMATION ====");
        System.out.print("Enter Student Name: ");
        name = in.nextLine();
 
        System.out.print("Enter Student ID: ");
        studentId = in.nextLine();
 
        System.out.print("Enter number of Subjects: ");
        int numSubj = in.nextInt();
 
        double sum = 0;
        for (int i = 1; i <= numSubj; i++) {
            System.out.print("Enter grade for Subject " + i + ": ");
            sum += in.nextDouble(); // Add grade directly to sum
        }
        in.nextLine(); // consume newline
 
        // Compute average immediately
        average = sum / numSubj;
 
        System.out.println("*** STUDENT SAVED ***");
        return average;
    }
 
    public static void computeStudAve() {
        if (name.isEmpty()) {
            System.out.println("No student data available. Please add student info first.");
        } else {
            System.out.println("Average Grade: " + average);
            
 
            if (average >= 75.0) {
                System.out.println("Status: PASS");
            } 
            else {
                System.out.println("Status: FAILED");
            }
        }
    }
 
    public static void displayInfo() {
        if (name.isEmpty()) {
            System.out.println("No student data available.");
        } else {
            System.out.println("==== STUDENT SUMMARY ====");
            System.out.println("Student Name: " + name);
            System.out.println("Student ID: " + studentId);
            System.out.println("Average Grade: " + average);
            
            if (average >= 75.0) {
                System.out.println("Status: PASS");
            } else {
                System.out.println("Status: FAILED");
            }
            
        }
    }
 
    
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char option = ' ';
 
        while (option != 'D') {
            displayMenu();
            option = in.next().toUpperCase().charAt(0);
            in.nextLine();
 
            switch (option) {
                case 'A':
                    studentInformation(in);
                    break;
                case 'B':
                    computeStudAve();
                    break;
                case 'C':
                    displayInfo();
                    break;
                case 'D':
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        in.close();
	}
}   