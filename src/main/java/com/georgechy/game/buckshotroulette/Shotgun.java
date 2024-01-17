package com.georgechy.game.buckshotroulette;

public interface Shotgun {
    public void shootSelf();
    public void shootOther();
    public void load();
    public void rack();
    public void checkempty();
    public void getCurrentShell();
    public void getLastShell();
    public void getShellsRemaining();
    public int getNumBlankShells();
    public int getNumLiveShells();

}
