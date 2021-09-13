/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio4;

/**
 *
 * @author user
 */
 public class Student {
    
    String onoma,eponymo;
    int am;
   
    
    public Student(String onoma, String eponymo,int am){
        this.onoma=onoma;
        this.eponymo=eponymo;
        this.am=am;
    }
    
    
    public String getOnoma(){
        return onoma;
    }
    
    public String getEponymo(){
        return eponymo;
    }

    public int getAm() {
        return am;
    }

    public void setAm(int am) {
        this.am = am;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public void setEponymo(String eponymo) {
        this.eponymo = eponymo;
    }

    
    @Override
    public String toString() {
        return "Student{" + "onoma=" + onoma + ", eponymo=" + eponymo + ", am=" + am + '}';
    }

    
    
    
}
