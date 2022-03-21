/**
   Shooter.java
   ---------------------------------------
   Programmer: Kevin Yao, Michael Zhou
   Date:  March 20th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This is a subclass of the superclass Videogames
*/ 
public class Shooter extends VideoGames{
   /*
   Attributes
   */
  
    /** name of the main character */
    private String playableCharacter;
  
    /** if the game is a battle royale or not (this is an attribute due to the large amount of new battle royale shooters) */
    private boolean isBattleRoyale;
  
  
   /*
   Constructors
   */

   /** 
     The constructor for the Shooter games 
     @param playableCharacter name of the main character
     @param numberOfCarriableItems the number of carriable items the character can carry
     @param genre the genre of the game
     @param perspective the perspective the game is played in
     @param objective the objective of the game
     @param location where the game takes place
     @param gamemode the gamemode of the game
     @param isBattleRoyale is the game a battle royale
   */
   public Shooter(String playableCharacter, int numberOfCarriableItems, String genre, String perspective, String objective, String location, String gamemode, boolean isBattleRoyale) {
      super(playableCharacter, numberOfCarriableItems, gamemode, genre, perspective, objective, location);
      this.playableCharacter = playableCharacter;
      this.isBattleRoyale = isBattleRoyale;
   }


   /*
   Methods
   */

    /* 
    Accessors
    */

    /**
     Gets the hp
     @return the hp of the character
    */
    public String getPlayableCharacter() {
      return this.playableCharacter;
    }
  
    /**
     Gets if it's a battle royale
     @return if it's battle royale 
    */
    public boolean getIsBattleRoyale() {
        return this.isBattleRoyale;
    }
  
   /*
   Mutators
   */

    /**
      Changes the main character's name for the game 
      @param setPlayableCharacter the new main character's name
    */
    public void setPlayableCharacter(String newPlayableCharacter) {
      this.playableCharacter = newPlayableCharacter;
    }

    /**
      Changes whether the game is a battle royale or not
      @param setIsBattleRoyale boolean whether the game is battle royale
    */
    public void setIsBattleRoyale(boolean newIsBattleRoyale) {
      this.isBattleRoyale = newIsBattleRoyale;
    }
  
   /*
   Other Methods
   */

    /**
     The Character shoots (preferably in the direction they're facing)
     */ 
    public void shoot() {
      System.out.println("The Character shoots their weapon!");
  }

    /**
     The Character slides on the ground (preferably in the direction they're facing)
     */
    public void dash() {
      System.out.println("The Character slides across the ground!\n");
    }

    /**
     The Character swaps their weapon
     */
    public void swapWeapons() {
      System.out.println("The Character swaps their weapon!");
  }
    
}
