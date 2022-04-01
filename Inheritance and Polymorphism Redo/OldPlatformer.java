/**
   OldPlatformer.java
   ---------------------------------------
   Programmer: Kevin Yao, Michael Zhou
   Date:  March 20th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This is the old class that created platformer games
*/ 
public class OldPlatformer {
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
    public OldPlatformer(int maxHp, int numberOfCarriableItems, String genre, String perspective, String objective, String location, String gamemode, String environment) {
      this.maxHp = maxHp;  
      this.numberOfCarriableItems = numberOfCarriableItems;
      this.genre = genre;
      this.perspective = perspective;
      this.objective = objective;
      this.location = location;
      this.gamemode = gamemode;
      this.environment = environment;  
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
