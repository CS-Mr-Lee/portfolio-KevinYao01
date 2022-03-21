/**
   Main.java
   ---------------------------------------
   Programmer: Kevin Yao, Michael Zhou
   Date:  March 20th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This is program creates the objects from the             superclass and subclasses and runs methods and shows     polymorphism, instanceOf, and method overriding as well as casting
*/ 
class Main {
  public static void main(String[] args) {
    //showing polymorphism by creating an object using the subclass under the superclass
    VideoGames [] myVideoGames = new VideoGames[4];
      myVideoGames[0] = new Shooter("Bob", 10, "Sci-fi", "Third Person", "Save the hostage", "Venice", "Single Player", false);
    
      myVideoGames[1] = new Platformer(150 ,10, "Adventure", "Third Person", "Get to the end before the lava gets you", "Mount Fuji", "Single Player", "Volcano");
    
      myVideoGames[2] = new Shooter("Alice", 15, "Horror", "First Person", "Escape the Village", "Asylum", "Single Player", false);
    
      myVideoGames[3] = new Platformer(200 ,20, "Open World", "Third Person", "Find the crystal before the bandits", "Paris", "Single Player", "City");
    
    //comparison to show method overriding in shooter and platformer below. This is method overriding because the same method name in different subclasses do different things 
    VideoGames myVideoGame = new VideoGames();
    myVideoGame.dash();

      //for loop that loops all the video games to dash
      for (int i = 0; i < myVideoGames.length; i++) {
         myVideoGames[i].move(10+i, 2+i);
         //casting within the if statement to subclasses to use their methods as they don't exist in the superclass
         //also showing that instanceof is like .equals for classes 
         if (myVideoGames[i] instanceof Platformer) {
            ((Platformer)myVideoGames[i]).dash();
         } else if (myVideoGames[i] instanceof Shooter) {
            ((Shooter)myVideoGames[i]).dash();
         }
      } 
    
    //casting objects to call the other methods
    ((Shooter)myVideoGames[2]).swapWeapons();
    ((Platformer)myVideoGames[1]).hit();
    ((Shooter)myVideoGames[0]).shoot();
  }
}