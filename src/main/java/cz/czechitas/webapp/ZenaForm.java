package cz.czechitas.webapp;

public class ZenaForm {
    private Integer dopravniProstredek = 0;
    private Integer barvaOci = 0;
    private Integer vyska = 0;
    private Integer velikostBot = 0;
    private Integer krecek = 0;
    private Integer lego = 0;
    private Integer hory = 0;
    private Integer java = 0;
    private Integer srdce = 0;
    private Integer sranda = 0;
    private String jmeno = "Olívie";

    public void setKrecek(Integer krecek) {
        this.krecek = krecek;
    }

    public void setLego(Integer lego) {
        this.lego = lego;
    }

    public void setHory(Integer hory) {
        this.hory = hory;
    }

    public void setJava(Integer java) {
        this.java = java;
    }

    public void setSrdce(Integer srdce) {
        this.srdce = srdce;
    }

    public void setSranda(Integer sranda) {
        this.sranda = sranda;
    }

    public Integer getKrecek() {
        return krecek;
    }

    public Integer getLego() {
        return lego;
    }

    public Integer getHory() {
        return hory;
    }

    public Integer getJava() {
        return java;
    }

    public Integer getSrdce() {
        return srdce;
    }

    public Integer getSranda() {
        return sranda;
    }

    public void setVyska(Integer vyska) {
        this.vyska = vyska;
    }

    public void setBarvaOci(Integer barvaOci) {
        this.barvaOci = barvaOci;
    }

    public void setVelikostBot(Integer velikostBot) {
        this.velikostBot = velikostBot;
    }

    public Integer getVelikostBot() {
        return velikostBot;
    }

    public void setDopravniProstredek(Integer dopravniProstredek) {
        this.dopravniProstredek = dopravniProstredek;
    }

    public Integer getVyska() {
        return vyska;
    }

    public void setBarvaOci(int barvaOci) {
        this.barvaOci = barvaOci;
    }

    public Integer getBarvaOci() {
        return barvaOci;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public Integer getDopravniProstredek() {
        return dopravniProstredek;
    }

    public void setDopravniProstredek(int dopravniProstredek) {
        this.dopravniProstredek = dopravniProstredek;
    }
}



//    private int[]  velbloudi;
//
//    public int[] getVelbloudi() {
//        return velbloudi;
//    }
//
//    public void setVelbloudi(int[] velbloudi) {
//        this.velbloudi = velbloudi;
//    }
//
//Hlavni controller:

//for (int item : vstup.getVelbloudi()) {
//        //seznamOdpovedi.add(item);
//        System.out.println(item);
//        }