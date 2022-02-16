/*
   Yao_Kevin_SASTriangleSolver.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  February 11th, 2022
   Course:  ICS4U1
   ---------------------------------------
   Description:
   This program returns the smallest angle in a triangle in degrees
*/ 

import java.util.*;
class Yao_Kevin_SASTriangleSolver{
   public static void main (String args[]) {
      //declaring all variables together
      Scanner input;
      double angleInBetween;
      double firstSide;
      double secondSide;
      
      input = new Scanner(System.in);
      
      //taking in input from the user
      System.out.println("Enter the first side's length: ");
      firstSide = input.nextDouble();
      
      System.out.println("Enter the second side's length: ");
      secondSide = input.nextDouble();
      
      System.out.println("Enter the angle between the two sides in radians: ");
      angleInBetween = input.nextDouble();
      
      //printing the smallest angle
      System.out.printf("The smallest angle is %.2f degrees." ,smallestAngle(firstSide, secondSide, angleInBetween));
   }
   
   /**
   * Name: smallestAngle
   * Description: This method takes in an angle between two given sides and outputs 
   * the smallest angle within the triangle formed from the given values
   * @param firstSide takes the length of one of the sides
   * @param secondSide takes the length of one of the sides
   * @param angleInBetween takes the angle between the two given sides
   * @return Returns the smallest angle of the triangle
   */ 
   
   public static double smallestAngle(double firstSide, double secondSide,double angleInBetween) {
      //declaring all variables here
      double thirdSide;
      double cosAngle;
      double firstAngle;
      double secondAngle;
      double thirdAngle;
      double angleToDegrees;
      double otherAngle;
      
      //turning the angle given into degrees for further use
      firstAngle = Math.toDegrees(angleInBetween);    
      
      //if the angle given is 60 degrees, it must be an equilateral triangle
      if (firstAngle == 60) {
         System.out.println("This is an equilateral triangle.");
         return firstAngle;
      }
      
      //turns the given angle into the cos value for cosine law  
      cosAngle = Math.cos(angleInBetween);
      
      //cosine law to find the third side for sine law
      thirdSide = Math.sqrt(Math.abs(Math.pow(firstSide, 2) + Math.pow(secondSide, 2) - (2*firstSide*secondSide*cosAngle)));
   
      //sine law for another angle
      secondAngle = Math.toDegrees(Math.asin(secondSide*(Math.sin(angleInBetween)/thirdSide)));
      
      //finding the last angle
      thirdAngle = 180 - secondAngle - firstAngle;
      
      //checks for smallest angle
      if (firstAngle < secondAngle && firstAngle < thirdAngle) {
         return firstAngle;
      } else if (secondAngle < firstAngle && secondAngle < thirdAngle) {
         return secondAngle;
      } else {
         return thirdAngle;
      }
   }
}



