package com.remijonathan.burgercaloriecounter;


public class Burger {
    static final int BEEF = 100;
    static final int LAMB = 170;
    static final int OSTRICH = 150;
    static final int ASIAGO = 90;
    static final int CREME_FRAICHE = 120;
    static final int PROSCUITTO = 115;

    private int pattyCal;
    private int cheeseCal;
    private int proscuittoCal;
    private int sauceCal;

    public Burger() {
        pattyCal = BEEF;
        cheeseCal = ASIAGO;
        proscuittoCal = 0;
        sauceCal = 0;
    }

    public int getPattyCal() {
        return pattyCal;
    }

    public void setPattyCal(int calories) {
        this.pattyCal = calories;
    }

    public int getCheeseCal() {
        return cheeseCal;
    }

    public void setCheeseCal(int calories) {
        this.cheeseCal = calories;
    }

    public int getProscuittoCal() {
        return proscuittoCal;
    }

    public void setProscuittoCal(int calories) {
        this.proscuittoCal = calories;
    }

    public int getSauceCal() {
        return sauceCal;
    }

    public void setSauceCal(int calories) {
        this.sauceCal = calories;
    }

    public void clearProscuittoCalories() {
        proscuittoCal = 0;
    }

    public int getTotalCalories() {
        return (pattyCal + cheeseCal + proscuittoCal + sauceCal);
    }
}
