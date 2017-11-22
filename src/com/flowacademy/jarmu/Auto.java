package com.flowacademy.jarmu;

public class Auto {

    protected int loero;
    protected int maxSebesseg;
    protected String tipus;

    public Auto(int loero, int maxSebesseg, String tipus) {
        this.loero = loero;
        this.maxSebesseg = maxSebesseg;
        this.tipus = tipus;
    }

    public float versenykepesseg() {
        return this.loero + this.maxSebesseg;
    }






    public int getLoero() {
        return loero;
    }

    public void setLoero(int loero) {
        this.loero = loero;
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(int maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }



    @Override
    public String toString() {
        return "Auto(" +
                "tipus: " + tipus +
                ", teljesítmény: " + loero +
                ", max sebesség: " + maxSebesseg +
                ", versenyképesség: " + versenykepesseg();
    }
}
