package com.georgechy.game.buckshotroulette;

import java.util.Random;
import java.util.Stack;

public class ShellRandomizer {
    private Stack<Shell> shells;
    Random rand = new Random();


    private int numLive = 0;
    private int numBlank = 0;

    /* Constructor */
    public ShellRandomizer() {
    }

    /* Randomizes How many Shells there are in the stack from 2-8 */

    /* Randomizes what each shell is with a minimum of 1 blank and 1 live shell */
        private Stack<Shell> randomizeShellOrder(int numShells) {
        Stack<Shell> shellStack = new Stack<Shell>();
        int i = numShells;
        boolean isLive;
        numLive = 0;
        numBlank = 0;

        for (int j = 0; j < i-1; j++) {
            isLive = rand.nextBoolean();
            if (isLive) {
                numLive++;
            } else {
                numBlank++;
            }
            //Shell shell = new Shell(rand.nextBoolean());
            shellStack.push(new Shell(isLive));
         }
        if (numLive == 0) {
            //Shell shell = new Shell(true);
            shellStack.push(new Shell(true));
        }else if (numBlank == 0) {
            //Shell shell = new Shell(false);
            shellStack.push(new Shell(false));
        }

        return shellStack;
    }
    
    /* Returns a set of shells in a random order */
    public Stack<Shell> getShells(int numShells) {
        shells = randomizeShellOrder(numShells);
        return shells;
    }
}
