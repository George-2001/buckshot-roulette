package com.georgechy.game.buckshotroulette;

import java.util.Random;
import java.util.Stack;
import java.util.ArrayList;

public class ShellRandomizer {
    private Stack<Shell> shells;
    Random rand = new Random();


    private int numLive = 0;
    private int numBlank = 0;

    /* Constructor */
    public ShellRandomizer() {
    }

    /* Returns a set of shells in a random order */
    public Stack<Shell> getShells(ArrayList<Shell> arrShells) {
        shells = randomizeShellOrder(arrShells);
        return shells;
    }    

    private Stack<Shell> randomizeShellOrder(ArrayList<Shell> arrShells) {
        Stack<Shell> shellStack = new Stack<Shell>();
        int i = arrShells.size();
        Shell tempShell;
        int swapIndex;

        for (int j = i-1; j > 0; j--) {
            swapIndex = rand.nextInt(j);
            tempShell = arrShells.get(swapIndex);
            arrShells.set(swapIndex, arrShells.get(j));
            arrShells.set(j, tempShell);
         }

        for (int k = 0; k < i; k++) {
            shellStack.push(arrShells.get(k));
         }
    return shellStack;
}

    /* Randomizes How many Shells there are in the stack from 2-8 */

    /* Randomizes what each shell is with a minimum of 1 blank and 1 live shell */
/*         private Stack<Shell> randomizeShellOrder(int numShells) {
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
    } */
    

}
