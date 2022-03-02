/**
   Human.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  March 1, 2022
   Course:  ICS4U1
   ---------------------------------------
   This Class creates a vegetable and the attributes with the constructor and contains all the methods to call attributes of a Vegetable object and mutate all attributes of a Vegetable object
*/ 

public class Vegetable {

     /*
      Attributes
     */
   
   /** the name of the vegetable */
   private String name;
   
   /** the number of calories in the vegetable */
   private int calories;
   
   /** the weight of the vegetable */
   private double weight;
   
     /*
      Constructors
     */
  
   /**
    Vegetable
    Creates a default vegetable
   */ 
   public Vegetable() {
     name = "";
     weight = -1;
     calories = -1;
   }

   /**
    Vegetable
    Creates a vegetable
    @param name the name of the vegetable
    @param weight the weight of the vegetable in grams
    @param calories how many calories are in the vegetable
   */ 
   public Vegetable(String name, double weight, int calories){
      this.name = name;
      this.calories = calories;
      this.weight = weight;
      
      //Restrictions on number of calories
      if (calories < 0){
         this.calories = 0;
      }
      else {
         this.calories = calories;
      }
      
      //Restrictions on weight  
      if (weight < 0){
         this.weight = 0;
      }
      else {
         this.weight = weight;
      }
   }
   
     /*
      Accessors
     */
   
   /**
    Gets the name of vegetable
    @return the name of the vegetable
   */
   public String getName(){
      return this.name;
   }
   
   /**
    Gets number of calories in the vegetable
    @return the number of calories in vegetable
   */
   public int getCalories(){
      return this.calories;
   }
   
   /**
    Gets the weight of the vegetable
    @return the weight of the vegetable
   */
   public double getWeight(){
      return this.weight;
   }
   
   /*
    Mutators
   */
   
   /**
    Changes the name for the vegetable
    @param newName the new name of the vegetable
   */
   public void setName(String newName){
      this.name = newName;
   }
  
   /**
    Changes the weight for vegetable
    @param newWeight the new weight of the vegetable
   */
   public void setWeight(double newWeight){
      this.weight = newWeight;
   }
  
   /**
    Changes caloric count of the vegetable
    @param newCalories the new weight of the vegetable
   */
   public void setCalories(int newCalories){
      this.calories = newCalories;
   }

   /**
    Returns all the attributes of the vegetable in String type
    @param the weight of the part of the vegetable that's about to get eaeten
    @return if the weight of the vegetable to be eaten is more than the weight of the vegetable itself, or the amount of calories in the part of the vegetable being eaten 
   */
    public int eaten(double weight) {
    double weightEaten;
    int caloriesEaten;
      
      if (weight > this.weight) {
        return -1;  
      } else {
        weightEaten = weight/this.weight;
        caloriesEaten = (int)(weightEaten * this.calories);
        return caloriesEaten;
      }    
  }
  
  /**
   Returns all the attributes of the vegetable in String type
   @return all the attributes of the vegetable 
  */
  public String toString() {
    String weightToString = Double.toString(this.weight); 
    String caloriesToString = Integer.toString(this.calories); 
    
    return "Name: " + name + "\n" + "Weight: " + weightToString + "\n" + "Calories: " + caloriesToString;
  }  
}