package com.georgechy.game.buckshotroulette.items;

import com.georgechy.game.buckshotroulette.Entities.Shotgun;
import com.georgechy.game.buckshotroulette.Models.Item;

public class Knife implements Item {

    private static Knife knife = null;
    
    public static Knife getInstance() {
        if (knife == null) {
            knife = new Knife();
        }
        return knife;
    }

    public void getDescription() {
        System.out.println("A knife. Use it to saw off the shotgun for double damage.");
    }

    public Shotgun use(Shotgun shotgun) {
        shotgun.sawOff();
        return shotgun;
    }

}
