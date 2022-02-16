/*
   Yao_Kevin_ChampionFilter.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  February 15th, 2022
   Course:  ICS4U1
   ---------------------------------------
   Description:
   This program finds the with the highest base HP
   and lowest base armor among league champs stored
   in the given file and outputs it to a new file
*/ 

import java.io.*;

public class Yao_Kevin_ChampionFilter{
   public static void main (String [] args)  {
      
      try {
         //declaring all variables
         String name;
         String highestHpChamp;
         String lowestArmorChamp;
         String line;
         double hp;
         double highestHp;
         double armor;
         double lowestArmor;
         
         //creating the reader and the writer
         BufferedReader input = new BufferedReader(new FileReader("champions.json"));
         BufferedWriter writer = new BufferedWriter(new FileWriter("MaxChampStats.txt"));
         
         //initializing all variables for use
         line = "";
         name = "";
         highestHpChamp = "";
         lowestArmorChamp = "";    
         highestHp = 0; //this value ensures the first hp value in the file will be taken 
         lowestArmor = 1000; //this value ensures the first armor value in the file will be taken
         
         //while there are more lines to read loop through the file
         while (true) {
            line = input.readLine();     
            //exit loops when there are no more lines to read
            if (line == null) {
               break;
            } 
            
            if (line.contains("\"name\"")) {
               //gets the name
               name = line.substring(13, line.length() - 2);
            }
            
            if (line.contains("\"hp\"")) {
               //gets hp of each champion in order of names
               hp = Double.parseDouble(line.substring(12, line.length() - 1));
               //if current HP is higher than the current max HP stored, replace the max HP stored with current
               if (hp > highestHp) {
                  highestHpChamp = name;
                  highestHp = hp;
               }
            }
            
            if (line.contains("\"armor\"")) {
               //gets armor of each champion in order of names
               armor = Double.parseDouble(line.substring(14, line.length() - 1));
               //if current armor is lower than the current lowest armor stored, replace the lowest armor stored with current    
               if (armor < lowestArmor) {
                  lowestArmorChamp = name;
                  lowestArmor = armor;
               } 
            }                       
         } 
         
         //writes to MaxChampStats file
         writer.write(highestHpChamp + " has the most hp at " + highestHp);
         writer.newLine();
         writer.write(lowestArmorChamp + " has the least armor at " + lowestArmor);
         
         //closes reader and writer
         input.close();
         writer.close();
         
      } catch (IOException e) {  
         System.out.print(e + "has occurred. Please fix the issue."); //tells the user what exception it is
      } 
   }
}
