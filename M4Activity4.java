package com.bpi.M4Activity4;

public class M4Activity4 {

public static void validateAccountNumber(String accountNumber) throws Exception {
        if (accountNumber == null) {
            throw new NullPointerException("Cannot be null");
        }

        if (accountNumber.length() != 10) {
            throw new Exception("Must be 10 digits");
        }

        // Optional: enforce digits-only rule
        for (int i = 0; i < accountNumber.length(); i++) {
            char c = accountNumber.charAt(i);
            if (!Character.isDigit(c)) {
                throw new Exception("Must contain digits only");
            }
        }

        System.out.println("Valid account: " + accountNumber);
    }

    public static void main(String[] args) {
        // Comprehensive test cases
        String[] testCases = {
            "1234567890",     // valid - should pass
            "123",            // invalid - too short
            "12345678901",    // invalid - too long
            null,             // invalid - null
            "",               // invalid - empty
            "12345abc90",     // invalid - non-digit characters
            "12345 6789",     // invalid - space inside
            "0000123456",     // valid - leading zeros
            "9876543210"      // valid - another correct case
        };

        for (String account : testCases) {
            try {
                System.out.println("Testing: " + String.valueOf(account));
                validateAccountNumber(account);
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("------------------------------------");
        }
    }
}
