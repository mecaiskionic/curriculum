package com.mecaiskitronic.curriculum.fragments.principals;

public class Carta {

    private String titul;
    private String descripcio;

    public Carta() {
    }

    public Carta(String titul, String descripcio) {
        this.titul = titul;
        this.descripcio = descripcio;
    }

    public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
}
