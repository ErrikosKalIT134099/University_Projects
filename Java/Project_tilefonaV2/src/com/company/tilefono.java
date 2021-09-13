package com.company;

/**
 * Created by ERRIKOS on 5/19/2017.
 */
public abstract class tilefono {


   String arithmos;
   double costos[]={0.05,0.07,0.08,0.10},kinitosecs,statherosecs;

public tilefono(String arithmos,double kinitosecs,double statherosecs){

    this.arithmos=arithmos;
    this.kinitosecs=kinitosecs;
    this.statherosecs=statherosecs;
}

    public String getArithmos() {
        return arithmos;
    }

    public void setArithmos(String arithmos) {
        this.arithmos = arithmos;
    }


    public double getKinitosecs() {
        return kinitosecs;
    }

    public double getStatherosecs() {
        return statherosecs;
    }

    public abstract int dial();

    public abstract double cost();


    public String toString(){
        return "";
    }
}
