package com.company;

/**
 * Created by ERRIKOS on 5/20/2017.
 */
public class stathero extends tilefono {

    public  stathero(String arithmos,double kinitosecs,double statherosecs){
        super(arithmos,kinitosecs,statherosecs);

        String psifia = "";
        String kodikos = "2";
        for (int i = 0; i < 9; i++) {
            char c = (char) (48 + (int) (Math.random() * 8));
            psifia =psifia+ c;
        }
        String statherosAr=kodikos+psifia;

        this.arithmos=statherosAr;
    }



    @Override
    public int dial() {
        int diarkeia = 0 + (int) (Math.random() * 1000);
        String rndthl=UserInput.rndthls();
        if(rndthl.charAt(0)=='6'){

            System.out.println("Ginete klhsh apo stathero thlefono : "+arithmos+" pros  kinito  thlefono: "+rndthl+
                    "\nme Diarkeia : ");

            kinitosecs+=diarkeia;

        }

        if (rndthl.charAt(0)=='2'){
            System.out.println("Ginete klhsh apo stathero thlefono : "+arithmos+" pros  Stathero  thlefono: "+rndthl+
                    "\nMe Diarkeia : ");

            statherosecs+=diarkeia;
        }


        return diarkeia;
    }

    @Override
    public double cost() {
        double sunolo=0.0;
        sunolo=(kinitosecs*costos[1])+(statherosecs*costos[0]);


        return  sunolo;
    }


//    @Override
//    public String toString() {
//        return "stathero{}"+arithmos;
//    }
}
