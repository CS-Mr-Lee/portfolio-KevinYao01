/**
   Cookie.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  March 1, 2022
   Course:  ICS4U1
   ---------------------------------------
   This Class creates a cookie with the attributes in the constructor and contains all the methods to call attributes of a Cookie object and mutate all attributes of the Cookie object
*/ 

public class Cookie {
  
      /*
      Class Fields
      */
   
    /** 
     Class Field
     Name of the cookie
    */
    private String name;

    /** 
     Class Field
     Weight in grams
    */
    private double weight;

    /** 
     Class Field
     Number of calories
    */
    private int calories;

    /** 
     Class Field
     Whether the cookie is packaged or not
    */
    private boolean isPackaged;

    /*
     Constructors
    */
  
   /**
    Cookie
    Creates a default cookie
   */
   public Cookie() {
      name = "";
      weight = -1;
      calories = -1;
      isPackaged = false;
   }

   /**
    Cookie
    Creates a default cookie
    @param name the name of the cookie
    @param weight the weight of cookie
    @param calories the number of calories in the cookie
   */
   public Cookie(String name, double weight, int calories) {
      this.name = name;
      this.weight = weight;
      this.calories = calories;
   }

   /**
    Cookie
    Creates a default cookie
    @param name the name of the cookie
    @param weight the weight of cookie
    @param calories the number of calories in the cookie
    @param isPackaged if the cookie is packaged or not
   */
   public Cookie(String name, double weight, int calories, boolean isPackaged) {
      this.name = name;
      this.weight = weight;
      this.calories = calories;
      this.isPackaged = isPackaged;
   }
  
   /*
   Accessors
   */
  
  /**
   Gets the name of the cookie 
   @return the cookie's name
  */
  public String getName() { 
    return this.name;
  }

  /**
   Gets the weight of the person
   @return the weight of the cookie
  */
  public double getWeight() {
    return this.weight;
  }

  /**
   Gets the energy level of human
   @return the cookie's caloric count
  */
  public int getCalories() {
    return this.calories;
  }

  /**
   Gets the energy level of human
   @return if the cookie packaged or not
  */
  public boolean getIsPackaged() {
    return this.isPackaged;
  }
  
      /*
       Mutators
      */
   
   /**
    Changes the name of the cookie
    @param newName the new name of the cookie
   */
   public void setName(String newName){
      this.name = newName;
   }

   /**
    Changes the weight for cookie
    @param newWeight the new weight of the cookie
   */
   public void setWeight(double newWeight){
      this.weight = newWeight;
   }
 
   /**
    Changes the caloric count for the cookie
    @param newCalories the new caloric count for the cookie   
   */
   public void setCalories(int newCalories){
      this.calories = newCalories;
   }

   /**
    Changes the if the cookie is packaged
    @param newIsPackaged if the cookie is packaged or not
   */
   public void setIsPackaged(boolean newIsPackaged){
      this.isPackaged = newIsPackaged;
   }

  /**
   Opens the package if packaged
   @return the person's energy level
  */
  public void open() {
    if (this.isPackaged == true) {
      this.isPackaged = false;    
    }
  }
  
  /**
   Returns calories eaten based on how much of the cookie is eaten
   @param weight the weight of the part of the cookie that's about to get eaten
   @return if the cookie is packaged, or if the weight of the cookie to be eaten is more than the weight of the cookie itself, or the amount of calories in the part of the cookie being eaten 
  */
  public int eaten(double weight) {
    double weightEaten;
    int caloriesEaten;
    
    //checks to see if theres too much food and also calculates weight lost from the food and calories eaten
    if (this.isPackaged == false) {
      if (weight > this.weight) {
        return -1;  
      } else {
        weightEaten = weight/this.weight;
        caloriesEaten = (int)(weightEaten * this.calories);
        this.weight -= (int)weight;
        this.calories -= caloriesEaten;
        return caloriesEaten;
      }
    } 
    return -2;
    
  }

  /**
   Returns all the attributes of the cookie in String type
   @return all the attributes of the cookie
  */
  public String toString() {
      return "Name: " + name + "\n" + "Weight: " + weight + "\n" + "Calories: " + calories + "\n" + "Is the cookie packaged: " + isPackaged;
  }  
}
  
