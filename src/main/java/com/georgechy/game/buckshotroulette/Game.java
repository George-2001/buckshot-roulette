package com.georgechy.game.buckshotroulette;

public class Game {

    int round = 0;
    int game = 0;
    int turn = 0;
    int playerHealth = 0;
    int dealerHealth = 0;
    int playerScore = 0;
    int itemsUsed = 0;

    public void playGame() {


        switch (game) {
            case 1:
                
                break;

            case 2:
                
                break;                
        
            case 3:

                break;
                
            default:
                break;
        }
    }
    

    public void roundOne() {
        playerHealth = 2;
        dealerHealth = 2;
        System.out.println("Round One");
        System.out.println("Player Health: " + playerHealth);
        System.out.println("Dealer Health: " + dealerHealth);

    }
    
}
