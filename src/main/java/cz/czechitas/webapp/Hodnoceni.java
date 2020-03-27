package cz.czechitas.webapp;

public class Hodnoceni {

    private String odpoved;
    private String spravna_odpoved;
    private String styl_odpovedi;
    private String styl_odpovedi2;
    private String feedback;
    private String hodnoceni;


    public Hodnoceni(String odpoved, String spravna_odpoved, String styl_odpovedi, String styl_odpovedi2, String feedback, String hodnoceni) {
        this.odpoved = odpoved;
        this.spravna_odpoved = spravna_odpoved;
        this.styl_odpovedi = styl_odpovedi;
        this.styl_odpovedi2 = styl_odpovedi2;
        this.feedback = feedback;
        this.hodnoceni = hodnoceni;
    }

    public String getOdpoved() {
        return odpoved;
    }

    public String getSpravna_odpoved() {
        return spravna_odpoved;
    }

    public String getStyl_odpovedi() {
        return styl_odpovedi;
    }

    public String gethodnoceni() {
        return hodnoceni;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getStyl_odpovedi2() {
        return styl_odpovedi2;
    }

    public void setStyl_odpovedi(String styl_odpovedi) {
        this.styl_odpovedi = styl_odpovedi;
    }

    public void setHodnoceni(String hodnoceni) {
        this.hodnoceni = hodnoceni;
    }

    public void setStyl_odpovedi2(String styl_odpovedi2) {
        this.styl_odpovedi2 = styl_odpovedi2;
    }

    public void setOdpoved(String odpoved) {
        this.odpoved = odpoved;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setSpravna_odpoved(String spravna_odpoved) {
        this.spravna_odpoved = spravna_odpoved;
    }
}
