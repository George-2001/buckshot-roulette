package com.georgechy.game.buckshotroulette.items;

import com.georgechy.game.buckshotroulette.Entities.Player;
import com.georgechy.game.buckshotroulette.Models.Item;

public class HandCuffs implements Item {

    private static HandCuffs handCuffs = null;
    
    public static HandCuffs getInstance() {
        if (handCuffs == null) {
            handCuffs = new HandCuffs();
        }
        return handCuffs;
    }

    public void getDescription() {
        System.out.println("A pair of handcuffs. Use it to skip your opponent's turn.");
    }

    public void use(Player player) {
        player.setHandCuffs(true);
    }

}
