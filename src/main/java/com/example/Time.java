package com.example;

public class Time {
    protected int ore;
    protected int minuti;
    protected int secondi;

    public Time(int ore, int minuti, int secondi) {
        if (ore < 0 || minuti < 0 || minuti >= 60 || secondi < 0 || secondi >= 60) {
            this.ore = 0;
            this.minuti = 0;
            this.secondi = 0;
        } else {
            this.ore = ore;
            this.minuti = minuti;
            this.secondi = secondi;
        }
    }

    public Time(int secondi) {
        if (secondi < 0) {
            this.ore = 0;
            this.minuti = 0;
            this.secondi = 0;
        } else {
            this.ore = secondi / 3600;
            secondi %= 3600;
            this.minuti = secondi / 60;
            this.secondi = secondi % 60;
        }
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    public int convertiSecondi() {
        return ore * 3600 + minuti * 60 + secondi;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", ore, minuti, secondi);
    }   


}
