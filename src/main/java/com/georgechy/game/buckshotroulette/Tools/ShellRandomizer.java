package com.georgechy.game.buckshotroulette.Tools;

import java.util.Random;
import java.util.Stack;

import com.georgechy.game.buckshotroulette.Entities.Shell;

import java.util.ArrayList;

public class ShellRandomizer {
    private Stack<Shell> shells;
    Random rand = new Random();

    /* Constructor */
    public ShellRandomizer() {
    }

    /* Returns a set of shells in a random order */
    public Stack<Shell> getShells(ArrayList<Shell> arrShells) {
        shells = randomizeShellOrder(arrShells);
        return shells;
    }    

    /* Randomizes How many Shells there are in the stack from 2-8 */

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

}
