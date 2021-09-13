package com.company;

public class testFoititis {




    public static void main(String[] args) {
	// write your code here

        foititis foit[]=new foititis[5];

//        for (int i=0;i<foit.length;i++) {
//
//            foit[i] = new foititis(randoms.rndOnoma(), randoms.rndEponymo(), randoms.rndAm(), randoms.rndAge(), 0);
//
//        }


        foit[0] = new foititis(randoms.rndOnoma(), randoms.rndEponymo(), 13223, randoms.rndAge(), 0);
        foit[1] = new foititis(randoms.rndOnoma(), randoms.rndEponymo(), 14223, randoms.rndAge(), 0);
        foit[2] = new foititis(randoms.rndOnoma(), randoms.rndEponymo(), 15223, randoms.rndAge(), 0);
        foit[3] = new foititis(randoms.rndOnoma(), randoms.rndEponymo(), 16223, randoms.rndAge(), 0);
        foit[4] = new foititis(randoms.rndOnoma(), randoms.rndEponymo(), 17223, randoms.rndAge(), 0);

        for (int i=0;i<foit.length;i++) {
            System.out.println(foit[i].toString());
        }



        System.out.println( foit[0].equalsAM(0));
        //int thesi= foititis.equalsAM(foit,1754223);

//        if (thesi > -1)
//            System.out.println ("\nO foititis me AM : "+foit[thesi].getAm()+" Vrethike sthn 8esi : "+ thesi+ " Me onoma :" +
//                    foit[thesi].getOnoma()+" kai Epitheto : "+foit[thesi].getEpitheto());
//            else
//            System.out.println("\nDen vre9ike o foititis !!!");
//
//
//
//
  }
}
