package askhsh2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {


    public static int getInteger() {
        Scanner input = new Scanner(System.in);
        try {
            int x;
            x = input.nextInt();
            return x;
        } catch (Exception e) {
            System.out.println("Error");
            return -1;
        }
    }

    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        try {
            double x;
            x = input.nextDouble();
            return x;
        } catch (Exception e) {
            System.out.println("Error");
            return -1;
        }
    }

    public static float getChar() {
        Scanner input = new Scanner(System.in);
        try {
            char x;
            x = input.next().charAt(0);
            return x;
        } catch (Exception e) {
            System.out.println("Error");
            return -1;
        }
    }

    public static String getString() {
        Scanner input = new Scanner(System.in);
        String x;
        x = input.nextLine();
        return x;
    }


    static short getShort() { // Methodos gia eisagogi short
        String line;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        try {
            line = in.readLine();
            Short i = Short.parseShort(line);
            return i;
        } catch (Exception e) {
            return -1;
        }


    }

    static int getMenuChoice() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice < 0 || choice > 8) {
            try {
                choice = Integer.parseInt(input.nextLine());
                if (choice < 1 || choice > 5) {
                    System.out.println("Den edwses egkuri epilogi");
                    System.out.println("Dwse Epilogh anamesa se 1-5 : " + "\n");
                    choice = Integer.parseInt(input.nextLine());
                }

            } catch (NumberFormatException e) {
                System.out.println("H Epilogh den einai Ari8mos	!");

            }
        }
        return choice;
    }

    static int getSubMenuChoice() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice < 1 || choice > 5) {
            try {
                choice = Integer.parseInt(input.nextLine());
                if (choice < 0 || choice > 8) {
                    System.out.println("Den edwses egkuri epilogi");
                    System.out.println("Dwse Epilogh anamesa se 1-5 : " + "\n");
                    choice = Integer.parseInt(input.nextLine());
                }

            } catch (NumberFormatException e) {
                System.out.println("H Epilogh den einai Ari8mos	!");

            }
        }
        return choice;
    }
}




