package com.georgechy.game.buckshotroulette.items;

import com.georgechy.game.buckshotroulette.Entities.Player;
import com.georgechy.game.buckshotroulette.Models.Item;

public class Cigarettes implements Item {

    private static Cigarettes cigarettes = null;
    
    public static Cigarettes getInstance() {
        if (cigarettes == null) {
            cigarettes = new Cigarettes();
        }
        return cigarettes;
    }

    public void getDescription() {
        System.out.println("A pack of cigarettes. Smoke it to restore 1 health.");
    }

    public void use(Player player) {
        player.setHealth(player.getHealth() + 1);   
        
    }

}
