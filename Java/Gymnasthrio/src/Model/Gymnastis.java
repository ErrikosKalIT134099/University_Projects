
package Model;

public class Gymnastis {    
    private String onoma;
    private eidiko_programma eidikotita;
    
    
    public Gymnastis() {}
    
    public Gymnastis(String onoma, eidiko_programma eidikotita) {
        this.onoma = onoma;
        this.eidikotita = eidikotita;
    }
    
    public String getOnoma() {
        return onoma;
    }

    public String toString() {    
        String ektyp = ("\nONOMA: " + this.onoma + "  Ειδικότητα: " + this.eidikotita); 
        return ektyp;
    }
}
