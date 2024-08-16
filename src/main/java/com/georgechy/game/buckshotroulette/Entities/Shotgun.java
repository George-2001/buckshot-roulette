package com.georgechy.game.buckshotroulette.Entities;
import java.util.Stack;

import com.georgechy.game.buckshotroulette.Tools.ShellRandomizer;

public class Shotgun {
    private Stack<Shell> shellStack;
    ShellRandomizer shellRandomizer = new ShellRandomizer();
    Shell chamberedShell;
    boolean sawedOff = false;
    int numBlank = 0;
    int numLive = 0;

    /* Contructor */
    public Shotgun(){
        
    }

    public void sawOff(){
        sawedOff = true;
    }
    /* If sawed off, 2 health is removed if shell is live */
    public boolean getSawedOff(){
        return sawedOff;
    }

    /* Fire Shotgun, remove health if live */
    public Shell fire(){ 
        chamberedShell = shellStack.pop();
        return chamberedShell;

    }

    /* shotgun is loaded, ONLY WHEN EMPTY */
    public void load(Stack<Shell> shellStack){
        this.shellStack = shellStack;
    }
    
    /* shotgun is racked, remove top shell */
    public void rack(){
        chamberedShell = shellStack.pop();
        if (chamberedShell.isLive) {
            System.out.println("Live Shell Ejected!");
        } else {
            System.out.println("Blank Shell Ejected!");
        }
    }

    /* if shotgun is empty, end round */
    public boolean checkempty(){
        if (shellStack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }

    }

    public Shell getCurrentShell(){
        return shellStack.peek();
    }

    //MIGHT NOT NEED BELOW METHODS IF DEALER KNOWS HOW MANY SHELLS REMAIN OF EACH TYPE

    // /* Returns final shell, only done for dealer either on last round, or if 2 shells remain */
    // public void getLastShell(){
    //     chamberedShell = shellStack.lastElement();
    //     if (chamberedShell.isLive) {
    //         System.out.println("Live Shell in Chamber!");
    //     } else {
    //         System.out.println("Blank Shell in Chamber!");
    //     }

    // }


    public int getShellsRemaining(){
        return shellStack.size();
    }
    public int getNumBlankShells(){
        numBlank = 0;
        for (Shell shell : shellStack) {
            if (shell.isLive == false) {
                numBlank++;
            }
        }
        return numBlank;
    }
    public int getNumLiveShells(){
        numLive = 0;
        for (Shell shell : shellStack) {
            if (shell.isLive) {
                numLive++;
            }
        }
        return numLive;
    }

}
