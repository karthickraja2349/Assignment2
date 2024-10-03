package com.assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondOccurence {
     
    private Scanner input = new Scanner(System.in);

    // Main Method
    public static void main(String[] args) {
        new SecondOccurence().initialize();
    }

    // Method to take User Input
    public void initialize() {
        try {
            System.out.println("Enter the Range of the Array:");
            int range = input.nextInt();
            int array[] = createArray(range); 
            printArray(array);
            int result = findSecondOccurence(array);

            if (result != -1) {
                System.out.println("\nSecond occurrence found at index: " + result);
            } else {
                System.out.println("\nSecond occurrence not found.");
            }
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
            }
             else {
                System.out.print(array[i]);    
            }
        }
        System.out.print("]\n");
    }        

    // Method to find the second occurrence
    private int findSecondOccurence(int[] array) {
        try {
            System.out.println("Enter the Element you Want to Find the Second Occurrence of:");
            int number = input.nextInt();
            int occurrence = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    occurrence++;
                    if (occurrence == 2) {
                        return i; 
                    }
                }
            }
            return -1; 
        } 
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            input.next(); 
            return findSecondOccurence(array); 
        }
    }
}

