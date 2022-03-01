/**
   Main.java
   ---------------------------------------
   Programmer: Kevin Yao
   Date:  March 1st, 2022
   Course:  ICS4U1
   ---------------------------------------
   This program creates objects from the human class
*/ 

class Main {  
  public static void main(String[] args) {
    //creating the human objects
    Human human1 = new Human("Bob", 80, 201.32, "M", 18, "Caucasion");
    Human human2 = new Human("Jane", 50, 80.27, "F", 19, "Asian");
    
    //Testing all acessors below by getting the attributes and printing
    String name = human1.getName();
    System.out.println("Name:" + name);

    double weight = human1.getWeight();
    System.out.println("Weight: "+ weight);

    double energyLevel = human1.getEnergyLevel();
    System.out.println("Energy: " + energyLevel + "%");

    String sex = human1.getSex();
    System.out.println("Sex: " + sex);

    int age = human1.getAge();
    System.out.println("Age: " + age);

    String race = human1.getRace();
    System.out.println("Race: " + race); 

    System.out.println("\n\n\n");

    //Testing all mutators below by setting the new attributes and then getting them and then printing the new attributes
    human1.setName("Doug");
    name = human1.getName();
    System.out.println("New Name: " + name);
    
    human1.setWeight(52);
    weight = human1.getWeight();
    System.out.println("New Weight: " + weight);
    
    human1.setEnergyLevel(82.2);
    energyLevel = human1.getEnergyLevel();
    System.out.println("New Energy: " + energyLevel + "%");
    
    human1.setSex("M");
    sex = human1.getSex();
    System.out.println("New Sex: " + sex);
    
    human1.setAge(20);
    age = human1.getAge();
    System.out.println("New Age:" + age);
    
    human1.setRace("Black");
    race = human1.getRace();
    System.out.println("New Race: " + race); 

    //testing sleep and run below
    human1.sleep(8);
    energyLevel = human1.getEnergyLevel();
    System.out.println("\n"+energyLevel);
    
    human1.run(1000);
    energyLevel = human1.getEnergyLevel();
    weight = human1.getWeight();
    System.out.println("Human 1's energy after running: "+energyLevel + "\n" + "Human 1's weight after running: " + weight +"\n");

    //testing the toString method to return all attributes for Bob
    System.out.println("All of human 1(formerly bob)'s Attributes in String: ");
    System.out.print(human1.toString());
    
    //new human object
    System.out.println("\n\nHuman 2 Object: \n");
    
    //Testing all acessors below by getting the attributes and printing
    String name2 = human2.getName();
    System.out.println("Name:" + name2);

    double weight2 = human2.getWeight();
    System.out.println("Weight: "+ weight2);

    double energyLevel2 = human2.getEnergyLevel();
    System.out.println("Energy: " + energyLevel2);

    String sex2 = human2.getSex();
    System.out.println("Sex: " + sex2);

    int age2 = human2.getAge();
    System.out.println("Age: " + age2);

    String race2 = human2.getRace();
    System.out.println("Race: " + race2); 
  
    //Testing all mutators below by setting the new attributes and then getting them and then printing the new attributes
    System.out.println("\n\n\n");
    
    human2.setName("alice");
    name2 = human2.getName();
    System.out.println("New Name: " + name2);
    
    human2.setWeight(52);
    weight2 = human2.getWeight();
    System.out.println("New Weight: " + weight2);
    
    human2.setEnergyLevel(85.36);
    energyLevel = human2.getEnergyLevel();
    System.out.println("New Energy: " + energyLevel2 + "%");
    
    human2.setSex("F");
    sex2 = human2.getSex();
    System.out.println("New Sex: " + sex2);
    
    human2.setAge(21);
    age2 = human2.getAge();
    System.out.println("New Age: " + age2);
    
    human2.setRace("Black");
    race2 = human2.getRace();
    System.out.println("New Race: " +  race2); 

    //Testing sleep and run below
    human2.sleep(8);
    energyLevel2 = human2.getEnergyLevel();
    System.out.println("\n"+energyLevel2);
    
    human2.run(1000);
    energyLevel2 = human2.getEnergyLevel();
    weight2 = human2.getWeight();
    System.out.println("Human 2(formerly Jane)'s energy after running: "+energyLevel2 + "\n" + "Human 2(formerly Jane)'s weight after running: " + weight2 +"\n");

    //testing the toString method to return all attributes for Jane
    System.out.println("All of human 2(formerly Jane)'s Attributes in String: ");
    System.out.print(human2.toString());
  }
}