/**
   Human.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  March 1, 2022
   Course:  ICS4U1
   ---------------------------------------
   This Class creates the attributes with the constructor and contains all the methods to call attributes of a Human object and mutate all attributes of a Human object
*/ 

public class Human {

    /*
    Attributes
    */
  
  /** the name of the human */
  private String name;

  /** the weight of the human */
  private double weight;

  /** the energy level the human has */
  private int energyLevel;

    /*
    Constructor
    */
  
   /**
    Human
    Default Human
   */ 
   public Human() {
     name = "";
     weight = -1;
     energyLevel = -1;
   }
  
   /**
    Human
    Creates a human
    @param name the name of human
    @param weight the weight of human
    @param energyLevel the energy level of human
   */
  public Human(String name, double weight, int energyLevel)  {
    //variables
    this.name = name;
    this.weight = weight;
    this.energyLevel = energyLevel;
    
    //setting restrictions for weight attribute 
    if (weight < 0)  {
      this.weight = 0;
    }
    else if(weight > 500)  {
      weight = 500;
    }

    //setting restrictions for energy level attribute
    if (energyLevel < 0)  {
      this.energyLevel = 0;
    }
    if (energyLevel > 100)  {
      this.energyLevel = 100;
    }  
  }
  
    /*
      Methods
    */
  
    /*
      Accessors
    */

  /**
   Gets the name of the human 
   @return the person's name
  */
  public String getName() { 
    return this.name;
  }

  /**
   Gets the weight of the person
   @return the weight of the person
  */
  public double getWeight() {
    return this.weight;
  }

  /**
   Gets the energy level of human
   @return the person's energy level
  */
  public double getEnergyLevel() {
    return this.energyLevel;
  }

    /*
      Mutators
    */

  /**
   Changes the name of the human
   @param newName expected new name
  */
  public void setName (String newName) {
    this.name = newName;
  }

  /**
   Changes the weight of the human
   @param newWeight expected new weight
  */
  public void setWeight(double newWeight) {
      
      if (newWeight < 0)  { //restriction from negative weight
         this.weight = 0; 
      } else if (newWeight == 0) { //specifically for 0
         this.weight = 0;
      } else if (newWeight > 500) {
          this.weight = 500;
      } else { //all other cases
         this.weight = newWeight;
      }
  }
  
  /**
   Changes the energyLevel of the human
   @param newEnergyLevel expected new energy level
  */
  public void setEnergyLevel (int newEnergyLevel) {

      if (newEnergyLevel < 0)  { //restriction from negative energy
         this.energyLevel = 0; 
      } else if (newEnergyLevel == 0) { //specifically for 0
         this.energyLevel = 0;
      } else if (newEnergyLevel > 100) {
         this.energyLevel = 100;    
      } else { //all other cases
         this.energyLevel = newEnergyLevel;
      }
  } 

    /*
      Other Methods
    */

  /**
   Adds energy level to the human based on how many hours they slept; the total energy level cannot be more than 100%
   @param hours the number of hours the human is going to sleep
  */
  public void sleep(int hours)  {
    this.energyLevel = energyLevel + (hours * 10);
    if (this.energyLevel > 100)  {
      this.energyLevel = 100;
    }
  }
  
  /**
   Subtracts energy level and weight from the human based on how many kilometers they ran; the total weight of the human cannot be negative and the total energy level cannot be less than 0%
   @param km the number of kilometers the human is going to run for
  */
  public void run (int km)  {
    
    if (this.weight < 0) {
      this.weight = 0;
    }
    
    this.energyLevel = energyLevel - km*3;
    this.weight = weight - km*0.001;
    
    if (this.energyLevel < 0)  {
      this.energyLevel = 0;
    } 
  }
  
  /**
   Human eats a vegetable and gains the weight of the vegetable and energy level is increased by the calories (15 cal = 1%)
   @param grams grams is the amount of food being eaten
  */
  public void eat(Vegetable veg, double grams) {
    if (veg.eaten(grams) == -1) {
      System.out.println("I don’t have that much food");
    } else {
      int amountEaten = veg.eaten(grams);
      this.weight = weight + (grams * 0.001);
      this.energyLevel = energyLevel + (amountEaten/15);    
      if (this.energyLevel > 100) {
        this.energyLevel = 100;
      }
    }
  }

  /**
   Human eats a cookie and gains the weight of the cookie and energy level is increased by the calories (15 cal = 1%)
   @param grams grams is the amount of food being eaten
  */
  public void eat(Cookie food, double grams) {

    if (food.eaten(grams) == -1) {
      System.out.println("I don’t have that much food");
    } else if (food.eaten(grams) == -2) {
      System.out.println("I can’t eat the bag");
    } else {
      int amountEaten = food.eaten(grams);
      this.weight = weight + (grams * 0.001);
      this.energyLevel = energyLevel + (amountEaten/15);   
      if (this.energyLevel > 100) {
        this.energyLevel = 100;
      }
    }
  }
  
  /**
   Returns all the attributes of the human in String type
   @return all the attributes of the human 
   */
  public String toString() {
    String weightToString = Double.toString(this.weight); 
    String energyLevelToString = Integer.toString(this.energyLevel); 

    return "Name: " + name + "\n" + "Weight: " + weightToString + "\n" + "Energy Level: " + energyLevelToString;
  }
  
}

