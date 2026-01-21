package com.bpi.M4Activity2;

public class M4Activity2 {

    // Account balances
    static double[] accounts = {10000, 15000, 20000};

    // Method to process withdrawal
    public static void processWithdrawal(String accountIndexInput, String amountInput) {
        try {
            // Parse inputs
            int index = Integer.parseInt(accountIndexInput);
            double amount = Double.parseDouble(amountInput);

            // Validate account index
            if (index < 0 || index >= accounts.length) {
                throw new ArrayIndexOutOfBoundsException();
            }

            double balance = accounts[index];

            // Check for insufficient funds
            if (amount > balance) {
                System.out.println("Current balance: P" + balance);
                System.out.println("Withdrawal: P" + amount);
                System.out.println("Insufficient funds! Cannot withdraw P" + amount);
                return;
            }

            // Update balance
            accounts[index] -= amount;
            System.out.println("Current balance: P" + balance);
            System.out.println("Withdrawal: P" + amount);
            System.out.println("New balance: P" + accounts[index]);
            System.out.println("Withdrawal successful!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input");
            System.out.println("Please enter valid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
        } catch (Exception e) {
            System.out.println("Transaction failed (unexpected error)");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("=== ATM Withdrawal System ===");

        System.out.println("\n--- Test 1: Valid Withdrawal ---");
        processWithdrawal("1", "5000");

        System.out.println("\n--- Test 2: Invalid Account Index ---");
        processWithdrawal("abc", "5000");

        System.out.println("\n--- Test 3: Account Not Found ---");
        processWithdrawal("10", "4000");

        System.out.println("\n--- Test 4: Insufficient Funds ---");
        processWithdrawal("1", "20000");

        System.out.println("\n=== All tests completed! ===");
    }
}
