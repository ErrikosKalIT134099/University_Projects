/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasthrio5.pkg2;

/**
 *
 * @author Errikos
 */
public class Car {
    
    private String pinakida,marka;
    private int arKukloforias;
    
    public Car(){}
    
    public Car(String marka,String pinakida,int arKukloforias){
        this.marka=marka;
        this.arKukloforias=arKukloforias;
        this.pinakida=pinakida;
        
    }

    public String getPinakida() {
        return pinakida;
    }

    public void setPinakida(String pinakida) {
        this.pinakida = pinakida;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getArKukloforias() {
        return arKukloforias;
    }

    public void setArKukloforias(int arKukloforias) {
        this.arKukloforias = arKukloforias;
    }

    @Override
    public String toString() {
        return "Car{" + "Marka: " +  marka+ ", Pinakida: " + pinakida + ", arKukloforias:" + arKukloforias + '}';
    }
    
    
}
