/**
   Platformer.java
   ---------------------------------------
   Programmer: Kevin Yao, Michael Zhou
   Date:  March 20th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This is a subclass of the superclass Videogames
*/ 
public class Platformer extends VideoGames{
   /*
   Attributes
   */
  
    /** the type of background environment inside the game */
    private String environment;

    /*
    Constructor
    */

    /** 
     The constructor for the platformer games
     @param maxHp the max hp of the character
     @param numberOfCarriableItems the number
     @param genre the genre of the game
     @param perspective the perspective of the game
     @param objective the objective of the game
     @param location the location of the game
     @param gamemode the gamemode of the game
     @param environment the environment of the game
    */
    public Platformer(int maxHp, int numberOfCarriableItems, String genre, String perspective, String objective, String location, String gamemode, String environment) {
      super(maxHp, numberOfCarriableItems, genre, perspective, objective, location, gamemode);
      this.environment = environment;  
   }

    /*
    Methods
    */

    /* 
    Accessors
    */
  
    /**
     Gets the environments
     @return the environment of the game 
    */
    public String getEnvironment()  {
        return this.environment;
    }

    /*
    Mutators
    */
  
    /**
     Sets the new environment
     @param newEnvironment the new environment the game should be in
    */ 
   public void setEnvironment(String newEnvironment) {
        this.environment = newEnvironment;
    }

    /*
    Other Methods
    */
  
    /**
     The character dashes
    */
    public void dash() {
      System.out.println("The Character blinks away!\n");
    }
  
    /**
     The character hits in front of them
    */
    public void hit() {
      System.out.println("The Character hits in front of them!");
    }
  
}
