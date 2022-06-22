package com.game.Platformer;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Node;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import static com.almasb.fxgl.dsl.FXGL.showMessage;
import static com.almasb.fxgl.dsl.FXGL.getGameController;

//import java.util.logging.Level;

//OBJECT ORIENTED PROGRAMMING FROM THE APPLICATION CLASS
public class Main extends Application {

    //maps keycode to boolean, saves keys to boolean? idk
    private HashMap<KeyCode, Boolean> keys = new HashMap<KeyCode, Boolean>();
    //list of platforms
    private ArrayList<Node> platforms = new ArrayList<>();
    
    //application root that contains all other roots and nodes
    private Pane appRoot = new Pane();
    
    //everything in the game, platforms, player, coins, enemies all things go here
    private Pane gameRoot = new Pane();
    
    //ui stuff
    private Pane uiRoot = new Pane();

    //player entity
    private Node player;
    
    //enemy entity
    private Node enemy;
    
    //velocity of the plater as a vector, not used here
    private Point2D playerVelocity = new Point2D(0, 0);
   
    //allows jumping
    private boolean canJump = true;
    
    //width of level
    private int levelWidth;
    
    //status of player
    boolean death = false;
    
    private void initContent(){
    	//background, also the width and height of the whole game
        Rectangle bg = new Rectangle(1280, 720);
        //this makes everything in this game 60 x 60 pixels except player
        levelWidth = LevelData.LEVEL1[0].length() * 60;
        
        //checks each String in LevelData class to create platforms, this goes down the columns
        for (int i=0; i< LevelData.LEVEL1.length; i++){
            String line = LevelData.LEVEL1[i];
            //this one goes down the rows
            for (int j=0; j <line.length();j++){
                switch (line.charAt(j)){
                    case '0':
                        break;
                    //creates a block each time a 1 is detected, x,y coords are first 2 numbers, 2 60s are size of blocks
                    case '1':
                        Node platform = createEntity(j*60, i *60, 60, 60, Color.WHITE);
                        platforms.add(platform);
                        break;
                }
            }
        }
        
        //creating enemy object
        enemy = createEntity(1200, 500, 40, 40, Color.BLUE);
        
        //creating player object
        player = createEntity(0, 600, 40, 40, Color.RED);
        
        //watches the players x coordinates to ensure the game keeps moving with the player
        player.translateXProperty().addListener((obs, old, newValue) -> {
            int offset = newValue.intValue();
            if (offset > 640 && offset < levelWidth-640){
                gameRoot.setLayoutX(-(offset-640));
            }
        });
        
        //add background, gameroot (game objects), then UI 
        appRoot.getChildren().addAll(bg, gameRoot, uiRoot);
    }
    //updates 
    private void update(){	
    	
    	//jumps with w key
        if (isPressed(KeyCode.W) && player.getTranslateY() >= 5){
            jumpPlayer();
        }
        
        //movement to left
        if (isPressed(KeyCode.A) && player.getTranslateX() >= 5){
            movePlayerX(-5);
        }
        
        //movement to right
        if (isPressed(KeyCode.D) && player.getTranslateX() + 40 <= levelWidth-5){
            movePlayerX(5);
        }
        
        //gravity
        if (playerVelocity.getY() < 10){
            playerVelocity = playerVelocity.add(0, 1);
        }
        movePlayerY((int)playerVelocity.getY());
    }

    //obtain value of how much they want to move
    private void movePlayerX(int value){
    boolean movingRight = value > 0;
    
    //makes the player move 1 unit at a time for the number of times given by int value
    //this is all for collision detection in the x direction
    for (int i=0; i < Math.abs(value);i++){
    	
    	//checks if a player touches enemy, if it does the player dies
    	if (player.getBoundsInParent().intersects(enemy.getBoundsInParent())) {
    		death = true;
    	}
    	
    	//checks for all platforms
        for (Node platform : platforms){
            if(player.getBoundsInParent().intersects(platform.getBoundsInParent())) {
            	//checks right
                if(movingRight){
                	//+40 because width of player on 
                    if (player.getTranslateX() + 40 == platform.getTranslateX()){
                        return; 
                    }
                //checks left
                }else {
                	//+60 because thats the width of the platform, the
                    if (player.getTranslateX() == platform.getTranslateX() + 60) {
                        return;
                    }
                }
            }
        }
        player.setTranslateX(player.getTranslateX() + (movingRight ? 1 : -1));
        }
    }
    
    //collision detection in the y coordinate direction
    private void movePlayerY(int value){
        boolean movingDown = value > 0;
        for (int i=0; i < Math.abs(value);i++){
            for (Node platform : platforms){
                if(player.getBoundsInParent().intersects(platform.getBoundsInParent())){
                    if(movingDown){
                        if (player.getTranslateY() + 40 == platform.getTranslateY()){
                            canJump = true;
                            return;
                        }
                    }else {
                        if (player.getTranslateY() == platform.getTranslateY() + 60) {
                            return;
                        }
                    }
                }
            }
            player.setTranslateY(player.getTranslateY() + (movingDown ? 1 : -1));
        }
    }
    
    
    private void jumpPlayer(){
    if(canJump){
    	//y axis goes down in javafx, so -30 is jumping up 30 units
        playerVelocity = playerVelocity.add(0, -30);
        //prevents infinite jumping
        canJump = false;
        }
    }
    
    //Node class can be replaced with sprites
    private Node createEntity(int x, int y, int w, int h, Color color){
    	//everything in game is a rectangle so we create them here
        Rectangle entity = new Rectangle(w, h);
        entity.setTranslateX(x);
        entity.setTranslateY(y);
        entity.setFill(color);
        gameRoot.getChildren().add(entity);
        return entity;
    }
    
    //gets key from hashmap to check if the button has been pressed
    private boolean isPressed(KeyCode key){
    	return keys.getOrDefault(key, false);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        initContent();
        //creates a scene which is stuff to be shown to the user
        Scene scene = new Scene(appRoot);
        //what key was pressed on keyboard, put into hashmap, and the value of the key is true
        scene.setOnKeyPressed(event -> keys.put(event.getCode(), true));
        //opposite of keyPressed
        scene.setOnKeyReleased(event -> keys.put(event.getCode(), false));
        primaryStage.setTitle("Very Basic Platformer");
        primaryStage.setScene(scene);
        //shows the scene after its been completely ready
        primaryStage.show();
        
        //ensures 60fps :)
        AnimationTimer timer = new AnimationTimer() {
        	//updates the game every 60 times a second
            @Override
            public void handle(long now) {
                update();
                //supposed to kill the player and start them from the first scene again, doesnt work idk why but it does the job kinda
                if (death == true) {
                	showMessage("You Died!", () -> {
                        getGameController().startNewGame();
                    });	
                }
            }
        };
        timer.start();
    }
    
    public static void main(String[] args) {
    	//starts the game
        launch(args);
    }
}