/*
   Yao_Kevin_Encryption.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  February 14th, 2022
   Course:  ICS4U1
   ---------------------------------------
   Description:
   This program encrypts a given string
*/ 

import java.util.Scanner;
public class  Yao_Kevin_Encryption{
   public static void main (String [] args) {
      //declaring all variables here
      String firstCharacter;
      String lastCharacter;
      String sentence;
      Scanner input;

      input = new Scanner(System.in);
      
      System.out.println("Input words split up by a space: ");
      sentence = input.nextLine();
            
      String [] words = sentence.split(" "); //splitting into different words
      firstCharacter = "";
      
      //nested for loop to get the index of the array and the letters of the word in that index
      for (int i = 0; i < words.length; i++) { 
         for (int j = 1; j < words[i].length(); j++) { //loops through each letter of the word stored in the array
            //grabs the first and last letters to use for swapping
            if (j == 1) {
            
            //gets first character of word
               firstCharacter = String.valueOf(words[i].charAt(0));
            //gets last character of word
               lastCharacter = String.valueOf(words[i].charAt(words[i].length()-1));
            //swapping the first letter of the word
               System.out.print(lastCharacter);
                    
            } else if (j == words[i].length()-1) { //on last letter print the first letter
               System.out.print(firstCharacter);
               break;
            }  
            
            //this line prints out the ascii values of the letters + 2 and converts it back into a string to print
            System.out.print(Character.toString(words[i].charAt(j)+2));                       
         }
         //space between encrypted words
         System.out.print(" ");
      } 
   }
}

