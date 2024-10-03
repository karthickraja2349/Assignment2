package com.assignment2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PrimeNumbers {

    // Main Method
    public static void main(String[] args) {
        new PrimeNumbers().initialize();
    }

    // Method to take user Input
    public void initialize() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the Start Range to Find the Prime Numbers:");
            int startRange = input.nextInt();

            System.out.println("Enter the End Range to Find the Prime Numbers:");
            int endRange = input.nextInt();

            // Ensure valid integer ranges
            if (startRange >= 1 && endRange <= Integer.MAX_VALUE && startRange <= endRange) {
                findPrime(startRange, endRange);
            } else {
                System.out.println("Enter a valid range. You entered: " + startRange + " to " + endRange);
                initialize();
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer value.");
            input.next();
            initialize(); 
        }
    }

    // Method to find and print prime numbers in the given range
    private void findPrime(int startRange, int endRange) {
        System.out.println("Prime numbers between " + startRange + " and " + endRange + ":");

       
        for (int i = startRange; i <= endRange; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

