//2. Create a program that takes a student's score as input and outputs their corresponding grade.

package com.assignment2;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StudentMark {
    
    // Main Method
    public static void main(String[] args) {
        new StudentMark().initialize();
    }
    
    //Method to take user Input
    public void initialize() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter Your Tamil Mark:");
            int tamilMark = Integer.parseInt(reader.readLine());
            validMark(tamilMark);
            
            System.out.println("Enter Your English Mark:");
            int englishMark = Integer.parseInt(reader.readLine());
            validMark(englishMark);
            
            System.out.println("Enter Your Maths Mark:");
            int mathsMark = Integer.parseInt(reader.readLine());
            validMark(mathsMark);
            
            System.out.println("Enter Your Science Mark:");
            int scienceMark = Integer.parseInt(reader.readLine());
            validMark(scienceMark);
            
            System.out.println("Enter Your Social Mark:");
            int socialMark = Integer.parseInt(reader.readLine());
            validMark(socialMark);
            
            System.out.println("Your Overall Grade is: " + assignGrade(tamilMark, englishMark, mathsMark, scienceMark, socialMark));
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
    
     //Method to validate mark
    private void validMark(int studentMark) {
        if (studentMark < 0 || studentMark > 100) {
            System.out.println("Please Enter a Valid Mark to Validate Your Grade (0-100)");
            initialize();
        }
    }
   
    //Method to return the Grade 
    private char assignGrade(int tamilMark, int englishMark, int mathsMark, int scienceMark, int socialMark) {
        int totalMark = tamilMark + englishMark + mathsMark + scienceMark + socialMark;
        int averageMark = totalMark / 5;

        if (averageMark >= 90) {
            return 'A';
        }
        else if (averageMark >= 75) {
            return 'B';
        } 
        else if (averageMark >= 60) {
            return 'C';
        } 
        else if (averageMark >= 50) {
            return 'D';
        }
         else {
            return 'F';
        }
    }
}

