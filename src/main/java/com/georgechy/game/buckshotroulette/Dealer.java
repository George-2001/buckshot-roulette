package com.georgechy.game.buckshotroulette;

public interface Dealer {

    /* Check Items at its disposal, returns a list, to be used in decision making */
    public void checkItems();

    /* Checks how many shells are left and what kinds they are, returns percentage of blank shells to be used in decision making */
    public void checkShotgun();
}
