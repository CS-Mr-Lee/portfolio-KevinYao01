/**
   VideoGames.java
   ---------------------------------------
   Programmer: Kevin Yao, Michael Zhou
   Date:  March 20th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This is the superclass Videogames that creates a generic version video game without specializing into    subclasses 
*/ 
public class VideoGames {
  
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
    
    /*
    Constructors
    */

    /** 
     The constructor for the platformer games 
     @param maxHp the max hp the character can have
     @param numberOfCarriableItems the number of carriable items the character can carry
     @param genre the genre of the game 
     @param perspective the perspective the game is played in 
     @param objective the objective of the game
     @param location where the game takes place in 
     @param gamemode the gamemode of the game
    */
   public VideoGames(int maxHp, int numberOfCarriableItems, String genre, String perspective, String objective, String location, String gamemode) {
      this.maxHp = maxHp;  
      this.numberOfCarriableItems = numberOfCarriableItems;
      this.genre = genre;
      this.perspective = perspective;
      this.objective = objective;
      this.location = location;
      this.gamemode = gamemode;
   }
  
  /** 
   The constructor for shooter games 
   Note: No maxHp here because if we included it the constructors would be identical so I hardcoded it to 100
   @param playableCharacter name of the main character
   @param numberOfCarriableItems the number of carriable items the character can carry
   @param gamemode the gamemode of the game
   @param genre the genre of the game
   @param perspective the perspective the game is played in
   @param objective the objective of the game
   @param location where the game takes place in
   */
   public VideoGames(String playableCharacter, int numberOfCarriableItems, String gamemode, String genre, String perspective, String objective, String location) {
      this.maxHp = 100;  
      this.numberOfCarriableItems = numberOfCarriableItems;
      this.gamemode = gamemode;
      this.genre = genre;
      this.perspective = perspective;
      this.objective = objective;
      this.location = location;

   }
  
  /** 
   The default constructor
  */
   public VideoGames() {
      this.maxHp = -1;  
      this.numberOfCarriableItems = -1;
      this.genre = "";
      this.perspective = "";
      this.objective = "";
      this.location = "";
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

   /*
   Other Methods
   */

   /**
     Distance a character moves in terms of m/s and seconds
     @param speed the speed of the character in m/s
     @param time the character moves in seconds
   */
   public void move(int speed, int time) {
      int distance = speed * time;
      System.out.println("The Character moves " + distance + " meters!");
   }
  
   /**
    The Character jumps
   */ 
   public void jump() {
     System.out.println("The Character Jumps!");
   }
  
  /**
   The character dashes (preferably in the direction they're facing)
  */ 
  public void dash() {
    System.out.println("The Character Dashes!\n");
  }
  
  /**
   Checks if the character is dead
   @param isDead true or false for if the character is dead
  */
  public void isDead(boolean isDead) {
    if (isDead == true) {
      System.out.println("The Character is dead!");   
    } else if (isDead == false) {
      System.out.println("The Character is alive!");  
    } 
  }
  
    
}
