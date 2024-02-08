package com.georgechy.game.buckshotroulette;
import java.util.Stack;

public class Shotgun {
    private Stack<Shell> shellStack;
    ShellRandomizer shellRandomizer = new ShellRandomizer();
    Shell chamberedShell;
    boolean sawedOff = false;

    /* Contructor */
    public Shotgun(){
        
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
    public void load(){
        shellStack = shellRandomizer.getShells();
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

    public void getCurrentShell(){
        chamberedShell = shellStack.peek();
        if (chamberedShell.isLive) {
            System.out.println("Live Shell in Chamber!");
        } else {
            System.out.println("Blank Shell in Chamber!");
        }
    }

    //MIGHT NOT NEED IF DEALER KNOWS HOW MANY SHELLS REMAIN OF EACH TYPE

    // /* Returns final shell, only done for dealer either on last round, or if 2 shells remain */
    // public void getLastShell(){
    //     chamberedShell = shellStack.lastElement();
    //     if (chamberedShell.isLive) {
    //         System.out.println("Live Shell in Chamber!");
    //     } else {
    //         System.out.println("Blank Shell in Chamber!");
    //     }

    // }


    public void getShellsRemaining(){

    }
    public int getNumBlankShells(){

    }
    public int getNumLiveShells(){

    }

}
