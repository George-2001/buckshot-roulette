package com.georgechy.game.buckshotroulette.Entities;
import java.util.ArrayList;
import java.util.List;

import com.georgechy.game.buckshotroulette.Models.Item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    int health;
    int score;
    boolean HandCuffs;
    Shell currentShell;
    List<Item> items;

    public Player() {
        health = 100;
        score = 0;
        HandCuffs = false;
        items = new ArrayList<Item>();  
    }

    public void addItem(Item item) {
        items.add(item);
    }

}
