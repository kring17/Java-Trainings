package com.bpi.M4Activity5;


public class M4Activity5 {

    // Checked exception
    public static class InvalidAccountNumberException extends Exception {
        public InvalidAccountNumberException(String message) { super(message); }
    }

    // Unchecked exception
    public static class InvalidAccountFormatException extends RuntimeException {
        public InvalidAccountFormatException(String message) { super(message); }
    }

    public static class AccountValidator {
        public void validateAccountNumber(String accountNumber)
                throws InvalidAccountNumberException {

            if (accountNumber == null) {
                throw new NullPointerException("Account number cannot be null");
            }
            for (char ch : accountNumber.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    throw new InvalidAccountFormatException("Account number must contain only digits");
                }
            }
            if (accountNumber.length() != 10) {
                throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
            }
            System.out.println("Valid account number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        AccountValidator validator = new AccountValidator();

        System.out.println("=== Account Number Validation Test ===\n");
        testValidation("Valid account", "1234567890", validator);
        testValidation("Too short", "123", validator);
        testValidation("Contains letters", "123ABC890", validator);
        testValidation("Contains space", "1234 567890", validator);
        testValidation("Null value", null, validator);
    }

    private static void testValidation(String testName, String accountNumber, AccountValidator validator) {
        System.out.println("Test: " + testName + " (" + accountNumber + ")");
        try {
            validator.validateAccountNumber(accountNumber);
        } catch (InvalidAccountNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAccountFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("\nWarning: " + e.getMessage());
        }
    }
}
