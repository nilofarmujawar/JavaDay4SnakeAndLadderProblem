package bridgelabz.program;

import java.util.Random;

class gamePlayer {
	
    int currentPosition = 0;
    
    Random rand = new Random();
    
    int attempts = 0;
    
    final int noPlay = 0, ladder = 1, snake = 2;
    
    int endGame = 0;

    public void  gameStart(String playerName) {
    	
        int rollDie = rand.nextInt(6) + 1;
        
        System.out.println("rollDie is :" + rollDie);
        
        int gameCheck = rand.nextInt(3);
        
        System.out.println("game Check is " + gameCheck);

        if (gameCheck == noPlay) {
        	
            currentPosition = currentPosition;
            
            System.out.println("This is no play.");
            
            System.out.println(playerName+ "'s current position is : " + currentPosition);
            
            attempts ++;
            
            endGame = currentPosition;

        }
        
        else if (gameCheck == ladder) {
        	
            currentPosition = currentPosition + rollDie;
            
            System.out.println("You got promoted by " + rollDie);
            
            System.out.println(playerName+ "'s current position is : " + currentPosition);
            
            attempts ++;
            
            endGame = currentPosition;
        }
        
        else {
        	
            if (currentPosition < rollDie) {
            	
                currentPosition = 0;
                
                System.out.println("You got snake of " + rollDie + " star again from zero.");
                
                System.out.println(playerName+ "'s current position is : " + currentPosition);
            }
            
            else {
            	
                currentPosition = currentPosition - rollDie;
                
                System.out.println("you got snake of " + rollDie);
                
                System.out.println(playerName+ "'s current position is : " + currentPosition);
            }
            
            attempts ++;
            
            endGame = currentPosition;
        }

    }

    public static void main(String[] args) {
    	
        System.out.println("Welcome to Snake & ladder game.");
        
        gamePlayer play1 = new gamePlayer();
        
        bridgelabz.program.gamePlayer play2 = new gamePlayer();
        
        while (play1.endGame <= 100 && play2.endGame <= 100) {
        	
            play1.gameStart("Player1");
            
            play2.gameStart("Player2");
            
        }
        
        if (play1.endGame < play2.endGame) {
        	
            System.out.println("Congratulation player 2 you have won the game.");
            
        } else if (play1.endGame > play2.endGame) {
        	
            System.out.println("Congratulation player 1 you have won the game.");
            
        } else {
        	
            System.out.println("match draw");

        }
    }
}