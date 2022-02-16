/*
   Yao_Kevin_FoolProof.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  February 14th, 2022
   Course:  ICS4U1
   ---------------------------------------
   Description:
   This program ensures good input and loops to
   ask the user to input a numerator and divisor 
   to perform division
*/ 

import java.util.*;
public class Yao_Kevin_FoolProof{
   public static void main(String[] args) {
      //variable declaration
      String numerator; 
      String firstCharacter;
      boolean goodInput;
      boolean exit;
      double doubleNumerator;
      double denominator; 
      double quotient;
      Scanner input;
             
      //variable initialization
      input = new Scanner(System.in);
      doubleNumerator = 0;
      denominator = 0;
      goodInput = false;
      exit = false;
      
      while (true) { 
         
         do {  //loop for numerator   
               
            try 
            {
               System.out.print("Enter Q or q to quit, or enter a number for your numerator: ");
               numerator = input.nextLine();
               
               firstCharacter = Character.toString(numerator.charAt(0));
               if (firstCharacter.toLowerCase().equals("q")) //checks if first character is q or Q
               {
                  exit = true;   //makes exit variable true, so right after it leaves this loop it breaks out of big loop
                  break;
               }
               
               doubleNumerator = Double.parseDouble(numerator); 
               goodInput = true; //input is good, so user can leave loop
                
            } catch (NumberFormatException e) 
            {
               System.out.println("You entered bad data.\nPlease try again.\n");
               goodInput = false;   //input invalid, loop
            }  
            
         } while(goodInput == false); 
         
         if (exit == true) {  //exits big loop 
            break;
         }  
                      
         do {  //loops for denominator
         
            try {
               System.out.print("Enter the denominator: ");
               denominator = input.nextDouble();
               
               //if denominator is 0, input isnt valid and loop. Otherwise leave this loop
               if (denominator == 0) { 
                  System.out.println("\nYou cannot divide by 0. Please enter something else.\n");
                  input.nextLine(); //must have this, or else it skips the next scanner input for some reason
                  goodInput = false;
               } else {                
                  input.nextLine();
                  goodInput = true;
               }
               
            } catch (InputMismatchException ex){
               System.out.println("You entered bad data.\nPlease try again.\n");
               input.nextLine();
               goodInput = false;   //input invalid, so loop
            }            
            
         } while (goodInput == false); 
         
         quotient = doubleNumerator/denominator;   //calculation
         System.out.printf("%.1f divided by %.1f is %.2f%n%n", doubleNumerator, denominator, quotient);
      } 
   }
}