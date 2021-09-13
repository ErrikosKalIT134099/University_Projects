package askhsh2;

public class TestMyUtils {

    public static void main(String[] args) {
        int select = 0;
        boolean exit = false;
        boolean checkObj = false;
        boolean checkAM = false;
        boolean checkEtos = false;


        Foititis pin[] = new Foititis[3];

        Menu.Welcome();
        Menu.MenuDisplay();

        while (!exit) {
            System.out.print("\n" + "Dwse Epilogh : ");
            select = UserInput.getMenuChoice();
            switch (select) {


                case 1:

                    for (int i = 0; i < pin.length; i++) {
                        pin[i] = new Foititis();

                        System.out.println("Dwse to AM Gia ton " + i + "o" + " Foithth : ");
                        int ArMitroou = UserInput.getInteger();
                        pin[i].setAm(ArMitroou);

                        System.out.println("Dwse to etos Gia ton " + i + "o" + "Foithth : ");
                        int etos = UserInput.getInteger();
                        pin[i].setEtos(etos);

                        System.out.println("|---------- Ta stoixeia tou " + i + "ou Foititi einai ----------|");
                        System.out.println(pin[i].toString());
                        System.out.println("|-------------------------------------------------------|");
//
                    }
                    System.out.println("<<<<Sinolikos Pinakas Stoixeiwn Foititwn - Mh taxinomhmenos>>>> ");
                    for (int i = 0; i < pin.length; i++) {

                        System.out.println(pin[i].toString());

                    }
                    checkObj = true;
                    break;

                case 2:
                    if (checkObj) {
                        int selTaxi = 0;
                        Menu.MenuSort();
                        System.out.print("\n" + "Dwse Epilogh Taxinomisis : ");
                        selTaxi = UserInput.getMenuChoice();

                        if (selTaxi == 1) {
                            //Taxinomisi AM
                            MyUtils.insertSortAM(pin);
                            System.out.println("<<<<Sinolikos Pinakas Stoixeiwn Foititwn - Taxinomhmenos>>>> ");
                            checkAM = true;
                            for (int i = 0; i < pin.length; i++) {

                                System.out.print(pin[i].toString());
                            }
                        }

                        if (selTaxi == 2) {
                            //Taxinomisi Eponymo

                            MyUtils.selectSortEponymo(pin);
                            System.out.println("<<<< Pinakas Stoixeiwn Foititwn - Taxinomhmenos kata Eponymo>>>> ");
                            for (int i = 0; i < pin.length; i++) {

                                System.out.print(pin[i].toString());
                            }

                        }
                        //Taxinomisi Etos
                        if (selTaxi == 3) {
                            checkEtos = true;
                            MyUtils.bubbleSortEE(pin);
                            System.out.println("Meta tin taxinomisi");
                            for (int i = 0; i < pin.length; i++)
                                System.out.print(pin[i] + " ");
                            System.out.println();
                        }
                        if (selTaxi == 4) {
                            System.out.println("Egine Exodos Apo thn Taxinomisi");
                            break;
                        }

                        //
                    } else
                        System.out.println("Den exei ginei Dhmiourgia Pinaka !");
                    break;
//        //anazitisi eponymoy

                case 3:
                    if (checkObj) {
                        int selSearch = 0;
                        Menu.MenuSearch();
                        System.out.print("\n" + "Dwse Epilogh Anazhthshs : ");
                        selSearch = UserInput.getSubMenuChoice();

                        if (selSearch == 1) {
                            System.out.println(" ");
                            System.out.println("Dwse Eponymo gia Anazitisi : ");
                            String Key = UserInput.getString();

                            int res = MyUtils.AnazhthshMeEponymo(pin, Key);
                            System.out.println("To Apotelesma ths Anazhthseis einai sthn thesh : " + res);
                        }

                        if (selSearch == 2 && checkAM == true) {
                            //Duadiki anazitisi
                            System.out.println(" ");
                            System.out.println("Dwse AM gia Anazitisi : ");
                            int key = UserInput.getInteger();

                            int result = MyUtils.anazitisiMeArMitrwou(pin, key);
                            System.out.println("To Apotelesma ths Anazhthseis einai sthn thesh : " + result);
                        } else
                            System.out.println("O pinakas Prepei na Taxinomi8ei!" + "\n");

                        if (selSearch == 3 && checkAM == true) {
                            //Recursive Duadiki anazitisi
                            System.out.println("Dwse AM gia Duadiki Anazitisi : ");
                            int key2 = UserInput.getInteger();
                            int found = MyUtils.anadromiAnazMeArithMitrwou(pin, key2, 0, pin.length - 1);
                            if (found > -1) {
                                System.out.println("O arithmos: " + key2 + " vrethike stin thesi:" + found);
                            } else {
                                System.out.println("O arithmos den vrethike");
                            }

                        }
                        if (selSearch == 4 && checkEtos == true) {
                            //Duadiki anazitisi
                            System.out.println(" ");
                            System.out.println("Dwse Etos gia Anazitisi : ");
                            int key3 = UserInput.getInteger();

                            int result3 = MyUtils.anazitisiMeEE(pin, key3);
                            System.out.println("To Apotelesma ths Anazhthseis einai sthn thesh : " + result3);
                        } else
                            System.out.println("O pinakas Prepei na Taxinomi8ei!" + "\n");

                        if (selSearch == 5) {
                            System.out.println("Egine Exodos apo thn Anazhthsh !");
                            break;
                        }
                    } else
                        System.out.println("Den exei ginei Dhmiourgia Pinaka ! " + "\n");
                case 4:
                    Menu.MenuDisplay();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Telos Programmatos ! ");

            }
        }

    }

}