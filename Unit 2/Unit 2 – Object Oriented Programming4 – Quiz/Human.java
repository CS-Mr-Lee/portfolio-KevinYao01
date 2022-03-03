/**
   Human.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  March 1, 2022
   Course:  ICS4U1
   ---------------------------------------
   This Class creates a human with the attributes in the constructor and contains all the methods to call attributes of a Human object and mutate all attributes of a Human object
*/ 

public class Human {

    /*
    Class Fields
    */
  
  /** the name of the human */
  private String name;

  /** the weight of the human */
  private double weight;

  /** the energy level the human has */
  private int energyLevel;

    /*
    Constructors
    */
  
   /**
    Human
    Creates a default Human
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
   Gets the weight of the human
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
          this.weight = 500; //set a weight max of 500 kilos 
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
    this.energyLevel += (hours * 10);
    if (this.energyLevel > 100)  {
      this.energyLevel = 100;
    }
  }
  
  /**
   Subtracts energy level and weight from the human based on how many kilometers they ran; the total weight of the human cannot be negative and the total energy level cannot be less than 0%
   @param km the number of kilometers the human is going to run for
  */
  public void run (int km)  {
    
    this.energyLevel = energyLevel - km*3;
    this.weight = weight - km*0.001;
    
    if (this.weight < 0) {
      this.weight = 0;
    }
    
    if (this.energyLevel < 0)  {
      this.energyLevel = 0;
    }
     
  }
  
  /**
   Human eats a vegetable and gains the weight of the vegetable and energy level is increased by the calories (15 cal = 1%)
   @param veg the vegetable object
   @param grams grams is the amount of food being eaten
  */
  public void eat(Vegetable veg, double grams) {
    int vegReturn = veg.eaten(grams);
    
    //checks to see if the vegetable can be eaten, and if it can adds the appropriate amount of energy and weight
    if (vegReturn == -1) {
      System.out.println("I don't have that much food");
    } else {
      this.weight = weight + (grams * 0.001);
      this.energyLevel = energyLevel + (vegReturn/15);  
        
      if (this.energyLevel > 100) {
        this.energyLevel = 100;
      }
    }
    
  }

  /**
   Human eats a cookie and gains the weight of the cookie and energy level is increased by the calories (15 cal = 1%)
   @param the cookie object
   @param grams grams is the amount of food being eaten
  */
  public void eat(Cookie food, double grams) {
    int cookieReturn = food.eaten(grams);
    
    //checks to see if the cookie can actually be eaten and if it can adds the appropriate amount to energy level and weight
    if (cookieReturn == -1) {
      System.out.println("I don't have that much food");
      return;
    } else if (cookieReturn == -2) {
      System.out.println("I can't eat the bag");
      return;
    } else {
      this.weight = weight + (grams * 0.001);
      this.energyLevel = energyLevel + (cookieReturn/15);   
      
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
    return "Name: " + name + "\n" + "Weight: " + weight + "\n" + "Energy Level: " + energyLevel;
  }
  
}

