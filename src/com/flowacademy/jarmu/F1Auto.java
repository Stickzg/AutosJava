package com.flowacademy.jarmu;

public final class F1Auto extends Auto {

    private String pilota;
    private float beallitasok;

    private float clearBeallitasok(float beallitasok) {
        if ( beallitasok < 0 ) {
             return beallitasok = 0;
        } else if (beallitasok > 1) {
            return beallitasok = 1;
        } else {
            return beallitasok;
        }
    }


    public F1Auto(String tipus, String pilota, int loero, int maxSebesseg, float beallitasok) {
        super(loero, maxSebesseg, tipus);
        this.pilota = pilota;
        this.beallitasok = clearBeallitasok(beallitasok);
    }





    public String getPilota() {

        return pilota;
    }

    public void setPilota(String pilota) {
        this.pilota = pilota;
    }


    public float getBeallitasok() {
        return beallitasok;
    }

    public void setBeallitasok(float beallitasok) {
        this.beallitasok = clearBeallitasok(beallitasok);
    }



    @Override
    public String toString() {
        return super.toString() + " pilóta: " + this.pilota +
                " beallitasok: " + this.beallitasok;
    }

    @Override
    public float versenykepesseg() {
        return super.versenykepesseg()*beallitasok;
    }



}
