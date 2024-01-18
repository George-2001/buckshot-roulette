package com.georgechy.game.buckshotroulette;
import java.util.Stack;

public class Shotgun {
    private Stack<Shell> shellStack;
    ShellRandomizer shellRandomizer = new ShellRandomizer();
    Shell chamberedShell;

    /* Contructor */
    public Shotgun(){
        
    }

    public void shootPlayer(){

    }
    public void shootDealer(){

    }
    public void load(){
        shellStack = shellRandomizer.getShells();
    }
    
    public void rack(){
        chamberedShell = shellStack.pop();
        if (chamberedShell.isLive) {
            System.out.println("Live Shell Ejected");
        } else {
            System.out.println("Blank Shell Ejected");
        }
    }

    public boolean checkempty(){
        if (shellStack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }

    }
    public void getCurrentShell(){

    }
    public void getLastShell(){

    }
    public void getShellsRemaining(){

    }
    public int getNumBlankShells(){

    }
    public int getNumLiveShells(){

    }

}
