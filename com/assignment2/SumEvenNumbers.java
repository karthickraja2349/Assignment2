//Write a program to find the sum of even numbers only in a given array. Use continue.

package com.assignment2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SumEvenNumbers {
     
    private Scanner input = new Scanner(System.in);

    // Main Method
    public static void main(String[] args) {
        new SumEvenNumbers().initialize();
    }

    // Method to take User Input
    public void initialize() {
        try {
            System.out.println("Enter the Range of the Array:");
            int range = input.nextInt();
            int array[] = createArray(range); 
            printArray(array);
            int sum = findSumOfEven(array);
            System.out.println("\nThe sum of even numbers in the array is: " + sum);
        } 
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer value.");
            input.next(); 
            initialize(); 
        }
    }

    // Method to create Array
    private int[] createArray(int range) {
        int array[] = new int[range];
        System.out.println("Enter the Elements of the Array:");
        try {
            for (int i = 0; i < range; i++) {
                array[i] = input.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            input.next(); 
            return createArray(range); 
        }
        return array;          
    }

    // Method to print Array
    private void printArray(int[] array) {
        System.out.println("The Array Elements are:");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", " + array[i]);
            } else {
                System.out.print(array[i]);    
            }
        }
        System.out.print("]\n");
    }

    // Method to find the sum of even numbers
    private int findSumOfEven(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                continue; 
            }
            sum += array[i]; 
        }

        return sum;
    }
}

