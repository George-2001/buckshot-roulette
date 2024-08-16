package com.georgechy.game.buckshotroulette;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.georgechy.game.buckshotroulette.Entities.Shell;
import com.georgechy.game.buckshotroulette.Entities.Shotgun;
import com.georgechy.game.buckshotroulette.Tools.ShellRandomizer;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

     ArrayList<Shell> arrShells = new ArrayList<Shell>() {{
        add(new Shell(true));
        add(new Shell(true));
        add(new Shell(true));
        add(new Shell(true));
        add(new Shell(false));
        add(new Shell(false));
        add(new Shell(false));
        add(new Shell(false));
     }
    };
     

     /* Asserts that there is at least one blank and one live shell in the stack of shells */
    @Test
    public void liveBlankMinOneTest()
    {
        ShellRandomizer shellRandomizer = new ShellRandomizer();
        Stack<Shell> shells = shellRandomizer.getShells(arrShells);
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

    @Test
    public void shellRandomizerTest()
    {
        int numLive = 0;
        int numBlank = 0;
        
        ShellRandomizer shellRandomizer = new ShellRandomizer();
        Stack<Shell> shells = shellRandomizer.getShells(arrShells);
        for (Shell shell : shells) {
            if (shell.isLive) {
                numLive++;
            } else {
                numBlank++;
            }
            if(numLive - 3 > numBlank || numBlank - 3 > numLive)
                assertTrue(false);
        }
        assertTrue(true);
    }
}
