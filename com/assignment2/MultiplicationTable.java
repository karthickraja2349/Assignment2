package com.assignment2;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class MultiplicationTable {
    
    // Main Method
    public static void main(String[] args) {
        new MultiplicationTable().initialize();
    }
    
    // Method to take user input
    public void initialize() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out, true);
        
        try {
            writer.write("Enter the Number for Which You Want the Multiplication Table:\n");
            writer.flush();
            int tableNumber = Integer.parseInt(reader.readLine()); 
            
            validateValue(tableNumber);
            
            writer.write("Enter the Total Number of Multiplications You Want:\n");
            writer.flush();
            int totalCount = Integer.parseInt(reader.readLine());
            
            validateValue(totalCount);
            
            writer.write("The Multiplication Table for " + tableNumber + " is:\n");
            writer.flush();
            printMultiplicationTable(tableNumber, totalCount);
            
        } 
        
        catch (IOException e) {
            System.err.println("Cannot Take Input From the BufferedReader: Better to import Scanner from java.util Package");
        }
        
        catch (NumberFormatException e) {
            System.err.println("Please Enter a Valid Number");
        } 
        
        finally {
            try {
                reader.close();
                writer.close();
            } 
            catch (IOException e) {
                System.err.println("Error closing the reader: " + e.getMessage());
            }
        }
    }                      
    
    // Method to Check Whether the Given Input is Valid or Not
    private void validateValue(int userInputNumber) {
        if (userInputNumber <= 0 || userInputNumber >= Integer.MAX_VALUE) {
            System.out.println("Please Enter a Valid Number: You Entered: " + userInputNumber); 
            initialize();
        }
    }           
    
    // Method to print Multiplication Table 
    private void printMultiplicationTable(int tableNumber, int totalNumber) {
        System.out.print("-------------");
        System.out.println();
        for (int i = 1; i <= totalNumber; i++) {
            System.out.printf("|%d x %d = %d|%n", tableNumber, i, tableNumber * i);
        }
        System.out.print("-------------");
    }
}

