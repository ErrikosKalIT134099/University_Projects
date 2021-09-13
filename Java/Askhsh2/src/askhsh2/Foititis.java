package askhsh2;

/**
 * Created by Errikos on 3/10/2017.
 */
public class Foititis {
    //
    private String onoma;
    private String eponymo;
    private int am, etos;

    //
    public Foititis() {


        onoma = "";
        for (int k = 0; k < 5; k++) {
            char c = (char) (65 + (int) (Math.random() * 26));
            onoma = onoma + c;
        }

        eponymo = "";
        for (int k = 0; k < 10; k++) {

            char c = (char) (65 + (int) (Math.random() * 26));
            eponymo = eponymo + c;


        }
    }


    @Override
    public String toString() {
        return " Onoma : " + onoma +
                " Eponymo : " + eponymo +
                " Am : " + am +
                " Etos : " + etos + "\n"
                ;
    }


    public String getEponymo() {
        return eponymo;
    }

    public int getAm() {
        return am;
    }

    public void setAm(int am) {
        this.am = am;
    }

    public int getEtos() {
        return etos;
    }

    public void setEtos(int etos) {
        this.etos = etos;
    }
}
