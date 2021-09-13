/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Errikos
 */
public class Synedria {
    private String hmera,wra;
    private int thesis;
    private Aithousa aith;
    private Gymnastis gymn;
    private eidiko_programma eidiko;

    public Synedria(String hmera, int thesis, String wra, Aithousa aith, Gymnastis gymn, eidiko_programma eidiko) {
        this.hmera = hmera;
        this.thesis = thesis;
        this.wra = wra;
        this.aith = aith;
        this.gymn = gymn;
        this.eidiko = eidiko;
    }

    public Aithousa getAith() {
        return aith;
    }

    public Gymnastis getGymn() {
        return gymn;
    }

    public eidiko_programma getEidiko() {
        return eidiko;
    }

    public void setAith(Aithousa aith) {
        this.aith = aith;
    }

    public void setGymn(Gymnastis gymn) {
        this.gymn = gymn;
    }

    public void setEidiko(eidiko_programma eidiko) {
        this.eidiko = eidiko;
    }


    

    
    public String getHmera() {
        return hmera;
    }

    public void setHmera(String hmera) {
        this.hmera = hmera;
    }

    public int getThesis() {
        return thesis;
    }

    public void setThesis(int thesis) {
        this.thesis = thesis;
    }

    public String getWra() {
        return wra;
    }

    public void setWra(String wra) {
        this.wra = wra;
    }
    
    //get gia to eidiko
    public String getGymnasti()
    {
        return gymn.getOnoma();
    }
    
    

    @Override
    public String toString() {
        return "Synedria: "+eidiko.getTitlos() + "hmera: " + hmera + " Wra: " + wra +
                " Gymnastis:"+gymn.getOnoma()+" Theseis: " + thesis ;
    }
    
}
