package com.company;

/**
 * Created by ERRIKOS on 5/13/2017.
 */
public class foititis {
    private String onoma,epitheto;
    private int am,age,etos;

    public foititis(){}

    public foititis(String onoma,String epitheto,int am,int age,int etos){

        this.onoma=onoma;
        this.epitheto=epitheto;
        this.am=am;
        this.age=age;
        this.etos=etos;
    }

    public String getOnoma(){return onoma;}

    public String getEpitheto(){return epitheto;}

    public int getAm(){return am;}

    public int getAge(){return age;}

    public int getEtos(){return etos;}

    public void setOnoma(String onoma){this.onoma=onoma;}

    public void setEpitheto(String epitheto) {this.epitheto = epitheto;}

    public void setAm(int am){this.am=am;}

    public void setAge(int age){this.am=am;}

    public void setEtos(int etos){this.etos=etos;}

    public int etosEisagwgis(){
        int etos=2017-age+18;
       return etos;
    }

    public boolean equalsAM(int ar){
        return (this.getAm() == ar);
    }

//    public static int equalsAM(foititis foit[],int ar){
//        for (int i=0;i<foit.length;i++)
//            if (foit[i].getAm() == ar)
//                return i;
//
//       return -1;
//
//    }

    public String toString(){
        String emf= "\nOnoma : "+onoma+
                    "\nEponymo : "+epitheto+
                    "\nAM : "+am+
                    "\nHlikia : "+age+
                    "\nEtos :"+etosEisagwgis();
        return emf;
    }
}
