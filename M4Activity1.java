package com.bpi.M4Activity1;

public class M4Activity1 {
	
	public class BankAccount {

	    public static String getAccountName(String accountNumber) {
	        if (accountNumber.equals("ACC-001")) {
	            return "Juan Dela Cruz";
	        } else if (accountNumber.equals("ACC-002")) {
	            return "Maria Santos";
	        } else {
	            return null;
	        }
	    }

	    public static void testCase(String accountNumber) {
	        System.out.println("Looking up account: " + accountNumber);
	        try {
	            String name = getAccountName(accountNumber);
	            String upperName = name.toUpperCase();
	            System.out.println("Account holder: " + upperName);
	        } catch (NullPointerException e) {
	            System.out.println("Error: Account not found!");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        System.out.println("=== Bank Account Name Display ===\n");

	        testCase("ACC-001");  // Valid account
	        testCase("ACC-999");  // Invalid account

	        System.out.println("=== Program completed successfully! ===");
	    }
	}
}

