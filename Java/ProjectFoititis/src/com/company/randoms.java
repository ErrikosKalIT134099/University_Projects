package com.company;
import java.util.Random;
/**
 * Created by ERRIKOS on 5/13/2017.
 */
public class randoms {
    public static String rndOnoma() {
        String rndString = "";
        int rndnumber = 0;
        rndnumber = 1 + (int) (Math.random() * 10);
        for (int i = 0; i < rndnumber; i++) {
            char c = (char) (65 + (int) (Math.random() * 26));
            rndString = rndString + c;

        }
        return rndString ;
    }

    public static String rndEponymo() {
        String rndString = "";
        int rndnumber = 0;
        rndnumber = 1 + (int) (Math.random() * 15);
        for (int i = 0; i < rndnumber; i++) {
            char c = (char) (65 + (int) (Math.random() * 26));
            rndString = rndString + c;

        }
        return rndString ;
    }

    public static int rndAm(){
        int rndint=0;
        rndint = 2 + (int) (Math.random() * 99999);
        return rndint;
    }

    public static int rndAge() {
        Random rn = new Random();
        int max = 39;
        int min = 18;
        int rndnumber = 0;
        rndnumber = rn.nextInt(max - min + 1) + min;

        return rndnumber;
        }

}
