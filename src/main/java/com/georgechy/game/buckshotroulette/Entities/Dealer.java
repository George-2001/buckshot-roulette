package com.georgechy.game.buckshotroulette.Entities;

import java.util.Random;
import java.util.Stack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dealer extends Player {

    int numBlank;
    int numLive;
    int difficulty;
    Stack<Shell> shellStack;
    Random rand = new Random();

    

    /* Check Items at its disposal, returns a list, to be used in decision making */
    private void checkItems(){
        System.out.println("Dealer has: ");}

    /* Checks how many shells are left and what kinds they are, returns percentage of blank shells to be used in decision making */
    private void checkShotgun(){
        System.out.println("Dealer has: ");}

    /* Loads the shotgun with shells, last shell is to be stored and only revealed to dealer when 1 shell remains */
    private void loadShotgun(int game, int round){
        switch (game) {
            case 1:
                switch (round) {
                    case 1:
                        shellStack.add(new Shell(true));
                        shellStack.add(new Shell(false));

                        break;
                    case 2:
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (round) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (round) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }     
    }
}
