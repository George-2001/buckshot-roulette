package com.georgechy.game.buckshotroulette.items;

import com.georgechy.game.buckshotroulette.Models.Item;

public class Beer implements Item {

    private static Beer beer = null;
    
    public static Beer getInstance() {
        if (beer == null) {
            beer = new Beer();
        }
        return beer;
    }


    public void getDescription() {
        System.out.println("A bottle of beer. Drink it to rack the shotgun.");
    }

}
