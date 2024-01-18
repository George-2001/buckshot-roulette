package com.georgechy.game.buckshotroulette;

import java.util.Random;
import java.util.Stack;

public class ShellRandomizer {
    private int numShells;
    private Stack<Shell> shells;
    Random rand = new Random();

    private int i;
    private int numLive = 0;
    private int numBlank = 0;

    /* Randomizes How many Shells there are in the stack from 2-8 */
    private int randomizeNumShells() {
        int numShells;
        numShells = rand.nextInt(7) + 2;
        return numShells;

    }
    /* Randomizes what each shell is with a minimum of 1 blank and 1 live shell */
    private Stack<Shell> randomizeShellOrder() {
        i = randomizeNumShells();
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
            Shell shell = new Shell(rand.nextBoolean());
            shells.push(shell);
        }
        if (numLive == 0) {
            Shell shell = new Shell(true);
            shells.push(shell);
        }else if (numBlank == 0) {
            Shell shell = new Shell(false);
            shells.push(shell);
        }

        return shells;
    }
    
    /* Returns a set of shells in a random order */
    public Stack<Shell> getShells() {
        shells = randomizeShellOrder();
        return shells;
    }
}
