//1. Take three numbers from the user and print the greatest number.

package com.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestNumber {
    
    //Main method
    public static void main(String[] args) {
        new GreatestNumber().initialize();
    }
    
    //Method to take input from user
    public void initialize() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter First Number:");
            int firstNumber = Integer.parseInt(reader.readLine());
            System.out.println("Enter Second Number:");
            int secondNumber = Integer.parseInt(reader.readLine());
            System.out.println("Enter Third Number:");
            int thirdNumber = Integer.parseInt(reader.readLine());

           System.out.println("The Greatest Number from "+firstNumber+" "+secondNumber+" "+thirdNumber+",is:"+ findMax(firstNumber,secondNumber, thirdNumber));
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
            } 
            catch (IOException e) {
                System.err.println("Error closing the reader: " + e.getMessage());
            }
        }
    }

     //Method to find maximum
    private int findMax(int firstNumber, int secondNumber, int thirdNumber) {
        
        return firstNumber > secondNumber ? (firstNumber > thirdNumber ? firstNumber : thirdNumber)
                                              : (secondNumber > thirdNumber ? secondNumber : thirdNumber);
    }
}

