/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasthrio2;

/**
 *
 * @author user
 */
public class student {
    
    private int am;
    private String onoma,eponymo;
    
    
    public student(){}
    
    public student(int am,String onoma,String eponymo){
        this.am=am;
        this.onoma=onoma;
        this.eponymo=eponymo;
    }
    
    public String toString(){
        return "AM: "+am+
               "Onoma: "+onoma+
               "Eponymo: "+eponymo;
    }
    
}
