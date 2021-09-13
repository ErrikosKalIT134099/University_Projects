
package Model;
import Controller.LoginController;
import Model.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Gymnastirio {
    private String epwnymia;
    private String dieythynsi;
   // private ArrayList <Gymnastis> gymnastes = new ArrayList<Gymnastis>();
   // private ArrayList <Eggrafi> eggrafes=new ArrayList<Eggrafi>();
  //  private ArrayList <Sydromitis> sydromites=new ArrayList<Sydromitis>();
  //  private ArrayList<eidiko_programma> eidiko=new ArrayList<eidiko_programma>();
  //  private ArrayList<Synedria> wrologioprog=new ArrayList<Synedria>(); //methodos add get
    
    public Gymnastirio() {}
    
    public Gymnastirio(String onoma, String eidikotita) {
        this.epwnymia = onoma;
        this.dieythynsi = eidikotita;
    }
    
    public String getOnoma() {
        return epwnymia;
    }
    
    public void Start() throws SQLException{
        LoginController cLogin = new LoginController(); 
    }
    
//    public void addGymnastis(Gymnastis gymn) {
//        gymnastes.add(gymn);
//    }
//    
//    public ArrayList<Gymnastis> getGymnastes(){
//        return gymnastes;
//          
//    }
//    
//    public void addEggrafi(Eggrafi eggr) {
//        eggrafes.add(eggr);
//    }
//    
//    public ArrayList<Eggrafi> getEggrafes(){
//        return eggrafes;
//          
//    }
//
//    public void addSydromitis(Sydromitis sydro) {
//        sydromites.add(sydro);
//    }
//    
//    public ArrayList<Sydromitis> getSydromitis() {
//        return sydromites;
//    } 
//    
//      public void addEidiko(eidiko_programma eidik) {
//         eidiko.add(eidik);
//    }
//    
//    public ArrayList<eidiko_programma> getEidikoPro() {
//        return eidiko;
//    } 
//    
    public void addSynedria(String hmera, int thesis, int wra, Aithousa aithousa, Gymnastis gymnastis){
     
       //wrologioprog.add(new Synedria(hmera,thesis,wra,aith,gymn,eidiko));
        
    }
    
    
}
