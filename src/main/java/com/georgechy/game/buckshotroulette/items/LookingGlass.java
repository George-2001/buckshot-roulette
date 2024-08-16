package com.georgechy.game.buckshotroulette.items;

import com.georgechy.game.buckshotroulette.Entities.Shell;
import com.georgechy.game.buckshotroulette.Entities.Shotgun;
import com.georgechy.game.buckshotroulette.Models.Item;

public class LookingGlass implements Item {
    private static LookingGlass lookingGlass = null;
    
    public static LookingGlass getInstance() {
        if (lookingGlass == null) {
            lookingGlass = new LookingGlass();
        }
        return lookingGlass;
    }

    @Override
    public void getDescription() {
        System.out.println("A Magnifying Glass. Use it to see the next shell in the shotgun.");
    }

    public Shell use(Object obj) {
        Shotgun shotgun = (Shotgun) obj;
        return shotgun.getCurrentShell();
    }

}
