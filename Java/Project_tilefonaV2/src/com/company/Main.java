package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=0;
        System.out.print("Dwse ton ari8mo twn tilefwnwn : ");
            n=UserInput.getInteger();

        tilefono thl[] = new tilefono[n];


        for (int i = 0; i < thl.length; i++) {
            if (i < (int) (thl.length * 0.3))
                thl[i] = new kinito("0", 0, 0);

            else if (i >= (int) (thl.length * 0.3) && i < (int) (thl.length * 0.7))
               thl[i] = new stathero("0", 0, 0);
            else
                thl[i] = new stathero("0", 0, 0);

        }

        System.out.println("\n>>>>>> Pragmatopoiish klhsewn <<<<<<");
        int x = 1000 + (int) (Math.random() * 10000);

        for (int i = 0; i < thl.length; i++) {
            for (int z = 0; z < x; z++)
            System.out.println(thl[i].dial());

        }
        System.out.println("\n>>>>>> Synoliko kostos kathe tilefwnou <<<<<<");
        for (int i = 0; i < thl.length; i++) {
            if (thl[i] instanceof stathero) {
                System.out.println("Arithmos (stathero) : " + thl[i].arithmos +
                        " Sunoliko kostos : " + +Math.round(thl[i].cost() * 100.0) / 100.0);
            }
            if (thl[i] instanceof kinito){
                System.out.println("Arithmos (kinito): "+thl[i].arithmos+
                            "Sunoliko kostos : "+Math.round(thl[i].cost() * 100.0) / 100.0);
                }

            }

        System.out.println("\n>>>>>> Sunolo Secs  gia stathera <<<<<<");
            double secsSt=0,secsKin=0;
        for (int i = 0; i < thl.length; i++) {

            if (thl[i] instanceof stathero) {
               secsSt=secsSt+ thl[i].getStatherosecs()+thl[i].getKinitosecs();
            }

            if (thl[i] instanceof kinito){
               secsKin=secsKin+ thl[i].getStatherosecs()+thl[i].getKinitosecs();

            }

        }
        System.out.println("Stahero Lepta omilias (Secs) : " + Math.round(secsSt * 100.0) / 100.0);
        System.out.println("Kinito Lepta omilias (Secs) : " + Math.round(secsKin * 100.0) / 100.0);


        System.out.println("\n>>>>>> Sunoliko Kostos Pros stathera/kinita <<<<<<");
        double costStathera=0.0,costKinita=0.0;
        for (int i = 0; i < thl.length; i++) {

            if (thl[i] instanceof stathero) {
                costStathera += thl[i].getStatherosecs() * 0.05;
            }

            if (thl[i] instanceof kinito) {
                costStathera += thl[i].getStatherosecs() * 0.08;
            }}

        System.out.println("Sunoliko Kostos Pros stathera : " +Math.round(costStathera * 100.0) / 100.0);

        for (int i = 0; i < thl.length; i++) {

            if (thl[i] instanceof stathero) {
                costKinita += thl[i].getKinitosecs() * 0.07;
            }

            if (thl[i] instanceof kinito) {
                costKinita += thl[i].getKinitosecs() * 0.10;
            }}

        System.out.println("Sunoliko Kostos Pros kinita : " + Math.round(costKinita * 100.0) / 100.0);


        System.out.println("\n>>>>>> Sunoliko Kostos apo oles ths klhseis <<<<<<");
            double sunoloAll=0;
        for (int i = 0; i < thl.length; i++) {
            sunoloAll+=thl[i].cost();

        }
        System.out.println("Pragmatopii8ikan : "+x+" Klhseis");
        System.out.println("Geniko Sunolo : "+Math.round(sunoloAll * 100.0) / 100.0);

    }

    }


