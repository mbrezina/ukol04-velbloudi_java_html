package cz.czechitas.webapp;

import javax.validation.constraints.Pattern;

public class MuzForm {
    @Pattern(regexp = "[a-zA-Zá-žÁ-Ž]+", message = "Jméno je povinné, používejte pouze písmena české abecedy")
    private String jmeno;

    private int dopravniProstredek = 0;
    private int barvaAuta = 0;
    private int vyska = 0;
    private int velikostBot = 0;
    private int motorka = 0;
    private int lego = 0;
    private int hory = 0;
    private int cpp = 0;
    private int srdce = 0;
    private int sranda = 0;

    public void setMotorka(int motorka) {
        this.motorka = motorka;
    }

    public void setLego(int lego) {
        this.lego = lego;
    }

    public void setHory(int hory) {
        this.hory = hory;
    }

    public void setCpp(int cpp) {
        this.cpp = cpp;
    }

    public void setSrdce(int srdce) {
        this.srdce = srdce;
    }

    public void setSranda(int sranda) {
        this.sranda = sranda;
    }

    public int getMotorka() {
        return motorka;
    }

    public int getLego() {
        return lego;
    }

    public int getHory() {
        return hory;
    }

    public int getCpp() {
        return cpp;
    }

    public int getSrdce() {
        return srdce;
    }

    public int getSranda() {
        return sranda;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public void setVelikostBot(int velikostBot) {
        this.velikostBot = velikostBot;
    }

    public int getVelikostBot() {
        return velikostBot;
    }

    public int getVyska() {
        return vyska;
    }

    public void setBarvaAuta(int barvaAuta) {
        this.barvaAuta = barvaAuta;
    }

    public int getBarvaAuta() {
        return barvaAuta;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getDopravniProstredek() {
        return dopravniProstredek;
    }

    public void setDopravniProstredek(int dopravniProstredek) {
        this.dopravniProstredek = dopravniProstredek;
    }
}

