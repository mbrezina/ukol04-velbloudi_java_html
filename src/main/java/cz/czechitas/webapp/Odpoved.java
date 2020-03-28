package cz.czechitas.webapp;

public class Odpoved {
    private String odpoved;
    private Integer hodnotaOdpovedi;
    private String checkedAttribute;


    public void setOdpoved(String odpoved) {
        this.odpoved = odpoved;
    }

    public void setHodnotaOdpovedi(Integer hodnotaOdpovedi) {
        this.hodnotaOdpovedi = hodnotaOdpovedi;
    }

    public void setCheckedAttribute(String checkedAttribute) {
        this.checkedAttribute = checkedAttribute;
    }

    public String getOdpoved() {
        return odpoved;
    }

    public Integer getHodnotaOdpovedi() {
        return hodnotaOdpovedi;
    }

    public String getCheckedAttribute() {
        return checkedAttribute;
    }

    public Odpoved(String odpoved, Integer hodnotaOdpovedi, String checkedAttribute) {
        this.odpoved = odpoved;
        this.hodnotaOdpovedi = hodnotaOdpovedi;
        this.checkedAttribute = checkedAttribute;
    }
}
