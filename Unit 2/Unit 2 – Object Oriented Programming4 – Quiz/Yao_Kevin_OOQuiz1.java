/**
   Yao_Kevin_OOQuiz1.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  March 1st, 2022
   Course:  ICS4U1
   ---------------------------------------
   This program runs as the main for the Human, Cookie, and Vegetable classes
*/ 

class Yao_Kevin_OOQuiz1 {  
  public static void main(String[] args) {
    //creating the objects below
    Human bob = new Human ("Bob", 80, 90);
    Vegetable cucumber = new Vegetable("Cucumber", 100, 30);
    Cookie chocolateChip = new Cookie();
    Cookie noChocolateChip = new Cookie("No Chocolate Chip Cookie", 100, 502);
    Cookie whiteChocolateChip = new Cookie("White Chocolate Chip", 50, 251, true);
    
    //eating with the package on
    bob.eat(whiteChocolateChip, 20);
    //eating more than the weight of the vegetable
    bob.eat(cucumber, 101);

    //this block shows that eat works and compares the before and after stats of the human
    System.out.println("Weight before eating: "+bob.getWeight());
    System.out.println("Energy Level before eating: "+bob.getEnergyLevel());
    
    bob.eat(noChocolateChip, 10);
    
    System.out.println("Weight after eating is: "+bob.getWeight());
    System.out.println("Energy Level after eating is: "+bob.getEnergyLevel());
    
  }
}