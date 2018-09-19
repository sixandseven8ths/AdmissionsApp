/*
 * Jeffrey Herold
 * January 29, 2013
 * Program: Admissions App
 * Purpose: Allow user to admit or deny applicant based on gpa
 */
package addmissionsapp;

/**
 *
 * @author Jeffrey.Herold
 */

import java.util.Scanner;

public class AddmissionsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Welcom message
        System.out.println("Welcome to the Admissions Application");
        System.out.println();
        
        //create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        
        //perform calculations
        String strChoice = "y";
        while (strChoice.equalsIgnoreCase("y")){
            
            //get user input
            System.out.print("Enter your Grade Point Average:   ");
            double grade = sc.nextDouble();
            
            System.out.print("Enter your Admission Test Score:   ");
            double score = sc.nextDouble();
            
            if (grade >= 3.0){
                if (score >= 60){
                    System.out.print("Accepted!");
                }else {
                    System.out.print("Rejected!");
                }
            }
            if (grade <= 3.0){
                if (score >= 80){
                    System.out.print("Accepted!");
                }else{
                    System.out.print("Rejected!");
                }
            }
            //see if user wants to continue
            System.out.print("Continue? (y/n): ");
            strChoice = sc.next();
            System.out.println();
          } 
      }
    }
