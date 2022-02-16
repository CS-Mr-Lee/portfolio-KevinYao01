/*
   Yao_Kevin_GroceryItem.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  February 14th, 2022
   Course:  ICS4U1
   ---------------------------------------
   Description:
   This program formats groceries item names
   and prices to look good inside a dashed line
   box
*/ 

import java.util.*;
class Yao_Kevin_GroceryItem{
   public static void main (String args[]) {
      //declaring all variables
      Scanner input;
      String firstItem;
      String secondItem;
      Double firstItemPrice;
      Double secondItemPrice;
      
      input = new Scanner(System.in);
      
      //this whole section below gets input from the user
      System.out.println("Enter your first grocery item: ");
      firstItem = input.nextLine();
      System.out.println("Enter your second grocery item: ");
      secondItem = input.nextLine();
      
      System.out.println("Enter the price of your first grocery item: ");
      firstItemPrice = input.nextDouble();
      System.out.println("Enter the price of your second grocery item: ");
      secondItemPrice = input.nextDouble();
      
      //creates the dashed line at top (max characters is 27)
      for (int i = 0; i < +27; i++) {
         System.out.print("-");
      }

      //finding out if the number is 3 or 4 digits to space appropriately
      //if the item is 3 digits, hence less than 10, there must be another space to format the price properly 
      //otherwise it's just a printf wiith the 20 character limit to reach 27 characters in total matching the borders on top and bottom
      if (firstItemPrice < 10) {
         System.out.printf("\n%-21s $%-4.2f", firstItem, firstItemPrice);
      } else if (firstItemPrice >= 10) {
         System.out.printf("\n%-20s $%-4.2f", firstItem, firstItemPrice);
      } 
      
      //finding out if the number is 3 or 4 digits to space appropriately    
      //if the item is 3 digits, hence less than 10 so there must be another space to format the price properly under the dashed borders
      //otherwise it's just a printf wiith the 20 character limit to reach 27 characters in total to match the dashed borders
      if (secondItemPrice < 10) {
         System.out.printf("\n%-21s $%-4.2f\n", secondItem, secondItemPrice);
      } else if (secondItemPrice >= 10) {
         System.out.printf("\n%-20s $%-4.2f\n", secondItem, secondItemPrice);
      }
      
      //creates the dashed line at bottom
      for (int i = 0; i < 27; i++) {
         System.out.print("-");
      }
   }
}

