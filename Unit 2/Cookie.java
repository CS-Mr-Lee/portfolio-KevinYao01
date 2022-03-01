/**
   Human.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  March 1, 2022
   Course:  ICS4U1
   ---------------------------------------
   This Class creates the attributes with the constructor and contains all the methods to call attributes of an object and 
   mutate all attributes of an object
*/ 

public class Cookie {
  
      /*
      Attributes
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
    @param isPackaged checks if the cookie is packaged or not
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
   Opens the package if packaged
   @return the person's energy level
  */
  public void open() {
    if (this.isPackaged == true) {
      this.isPackaged = false;    
    }
  }
  
  /**
   Returns all the attributes of the vegetable in String type
   @param the weight of the part of the cookie that's about to get eaten
   @return if the cookie is packaged, or if the weight of the cookie to be eaten is more than the weight of the cookie itself, or the amount of calories in the part of the cookie being eaten 
  */
  public int eaten(double weight) {
    double weightEaten;
    int caloriesEaten;
    
    if (this.isPackaged == false) {
      if (weight > this.weight) {
        return -1;  
      } else {
        weightEaten = weight/this.weight;
        caloriesEaten = (int)(weightEaten * this.calories);
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
    String weightToString = Double.toString(this.weight); 
    String caloriesToString = Integer.toString(this.calories); 
    String isPackagedToString = Boolean.toString(this.isPackaged);
    
    return "Name: " + name + "\n" + "Weight: " + weightToString + "\n" + "Calories: " + caloriesToString + "\n" + "Is the cookie packaged: " + isPackagedToString;
  }  
}
  
