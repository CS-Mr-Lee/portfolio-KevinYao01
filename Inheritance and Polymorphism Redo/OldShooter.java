/**
   OldShooter.java
   ---------------------------------------
   Programmer: Kevin Yao, Michael Zhou
   Date:  March 20th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This is the old class that created shooter games
*/ 
public class OldShooter {
   /*
   Attributes
   */

    /** the max hp of the character */
    private int maxHp;

    /** the number of items a character can carry */
    private int numberOfCarriableItems;

    /** what the genre of the game is*/
    private String genre;

    /** player's perspective of the game */
    private String perspective;

    /** the location the game takes place in */
    private String location;

    /** what the objective of the game is */
    private String objective;

    /** if the game is multiplayer, singleplayer, or coop*/
    private String gamemode;
  
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
   public OldShooter(int maxHp, String playableCharacter, int numberOfCarriableItems, String genre, String perspective, String objective, String location, String gamemode, boolean isBattleRoyale) {
      this.maxHp = maxHp;  
      this.numberOfCarriableItems = numberOfCarriableItems;
      this.genre = genre;
      this.perspective = perspective;
      this.objective = objective;
      this.location = location;
      this.gamemode = gamemode;
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
    public int getMaxHp() {
        return this.maxHp;
    }

    /**
     Gets the number of carriable items in the game 
     @return the number of carriable items
    */
    public int getNumberOfCarriableItems() {
        return this.numberOfCarriableItems;
    }

    /**
     Gets genre of the video game
     @return the video game's genre
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     Gets the perspective the game is played in
     @return the perspective of the game
    */
    public String getPerspective() {
        return this.perspective;
    }
  
    /**
     Gets the objective of the game
     @return the objective of the game
    */
    public String getObjective() {
        return this.objective;
    }

    /**
     Gets the gamemode of the game
     @return the gamemode of the game
    */
    public String getGamemode()  {
        return this.gamemode;
    }

    /**
     Gets the location of the game
     @return the location of the game
    */
    public String getLocation()  {
        return this.location;
    }
  
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
     Changes the max hp of the character in the game
     @param newMaxHp the new max hp of the character
    */
   public void setMaxHp(int newMaxHp) {
        this.maxHp = newMaxHp;
    }
  
    /**
     Changes the number of carriable items in the game
     @param newNumberOfCarriableItems the new number of carriable items 
    */
   public void setNumberOfCarriableItems(int newNumberOfCarriableItems) {
        this.numberOfCarriableItems = newNumberOfCarriableItems;
    }

    /**
     Changes the genre of the game
     @param newGenre the new number of carriable items 
    */ 
   public void setGenre(String newGenre) {
        this.genre = newGenre;
    }
   /**
    Changes the perspective of the game
    @param newPerspective the new perspective in the game
   */  
   public void setPerspective(String newPerspective) {
        this.perspective = newPerspective;
    }
  
   /**
    Changes the objective of the game
    @param newObjective the new objective of the game
   */  
   public void setObjective(String newObjective) {
        this.objective = newObjective;
    }

   /**
    Changes the gamemode of the game
    @param newGamemode the new gamemode
   */ 
   public void setGamemode(String newGamemode) {
        this.gamemode = newGamemode;
    }
  
   /**
    Changes location of the game
    @param newLocation the new location
   */  
   public void setLocation(String newLocation) {
        this.location = newLocation;
    }
  
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
