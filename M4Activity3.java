package com.bpi.M4Activity3;

public class M4Activity3 {

//Method to check balance
 public static void checkBalance(String accountNumber, double balance) {
     System.out.println("Processing balance inquiry...");

     try {
         // Parse account number to integer
         int accountNumInt = Integer.parseInt(accountNumber);

         // Determine account type from first character
         char accountTypeChar = accountNumber.charAt(0);
         String accountType;

         if (accountTypeChar == '1') {
             accountType = "Savings";
         } else if (accountTypeChar == '2') {
             accountType = "Checking";
         } else {
             accountType = "Unknown";
         }

         // Print account details
         System.out.println("Account Type: " + accountType);
         System.out.println("Account Number: " + accountNumber);
         System.out.println("Current Balance: P" + balance);
         System.out.println("Balance inquiry successful!");

     } catch (NumberFormatException e) {
         System.out.println("Error: Invalid account number format!");
     } catch (StringIndexOutOfBoundsException e) {
         System.out.println("Error: Account number is empty or invalid!");
     } finally {
         // Receipt printing (always executes)
         System.out.println("\n=== RECEIPT ===");
         System.out.println("Transaction Date: December 3, 2025");
         System.out.println("Transaction Type: Balance Inquiry");
         System.out.println("ATM Location: Thank you for banking with us!\n");
     }
 }

 // testing
 public static void main(String[] args) {
     System.out.println("=== ATM Balance Check ===");

     System.out.println("\n--- Test 1: Valid Savings Account ---");
     checkBalance("100123456", 15000.00);

     System.out.println("\n--- Test 2: Valid Checking Account ---");
     checkBalance("200987654", 25000.00);

     System.out.println("\n--- Test 3: Invalid Account Format ---");
     checkBalance("ABC12345", 15000.00);

     System.out.println("\n--- Test 4: Empty Account Number ---");
     checkBalance("", 15000.00);

     System.out.println("\n=== All tests completed! ===");
 }
}

