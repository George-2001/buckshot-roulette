package com.georgechy.game.buckshotroulette;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.georgechy.game.buckshotroulette.Entities.Dealer;
import com.georgechy.game.buckshotroulette.Entities.Player;
import com.georgechy.game.buckshotroulette.Entities.Shell;
import com.georgechy.game.buckshotroulette.Entities.Shotgun;
import com.georgechy.game.buckshotroulette.Tools.ShellRandomizer;
import com.georgechy.game.buckshotroulette.items.LookingGlass;

public class ItemTest {
    Shotgun shotgun;
    Dealer  dealer;
    Player  player;
    Stack<Shell> shellStack = new Stack<Shell>();
    ShellRandomizer shellRandomizer = new ShellRandomizer();
    LookingGlass lookingGlass = LookingGlass.getInstance();

    @Before
    public void setUp() {
        shellStack.add(new Shell(true));
        shellStack.add(new Shell(false));
        shotgun = new Shotgun();
        shotgun.load(shellStack);
        dealer = new Dealer();
        player = new Player();

    }

    @Test
    public void lookingGlassTest(){
        Shell shell = lookingGlass.use(shotgun);
        assertFalse(shell.isLive());
    }




}
