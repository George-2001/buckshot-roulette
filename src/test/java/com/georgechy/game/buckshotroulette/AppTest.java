package com.georgechy.game.buckshotroulette;

import java.util.Stack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

     /* Asserts that there is at least one blank and one live shell in the stack of shells */
    @Test
    public void liveBlankMinOneTest()
    {
        ShellRandomizer shellRandomizer = new ShellRandomizer();
        Stack<Shell> shells = shellRandomizer.getShells();
        int numLive = 0;
        int numBlank = 0;
        for (Shell shell : shells) {
            if (shell.isLive) {
                numLive++;
            } else {
                numBlank++;
            }
        }
        System.out.println("Live: " + numLive + " Blank: " + numBlank);
        assertTrue( numBlank > 0 && numLive > 0 );
    }  

    @Test
    public void shotgunLoadTest()
    {
        Shotgun shotgun = new Shotgun();
        Stack<Shell> shells = new Stack<Shell>();
        shells.push(new Shell(true));
        shells.push(new Shell(false));
        shotgun.load(shells);
        assertTrue( shotgun.checkempty() == false );
    }
}
