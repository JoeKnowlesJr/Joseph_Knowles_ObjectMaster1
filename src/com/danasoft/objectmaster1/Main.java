package com.danasoft.objectmaster1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static Wizard hatfield;
    private static Ninja mccoy;
    private static Samurai phillips;


    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        hatfield = new Wizard(3, 3, 3, 100);
        mccoy = new Ninja(3, 3, 3, 100);
        phillips = new Samurai(3, 3, 3, 100);

        displayHumans();
        System.out.println("\r\n\tHatfield attacks McCoy!\r\n");
        hatfield.attack(mccoy);
        displayHumans();
        System.out.println("\r\n\tHatfield attacks Phillips!\r\n");
        hatfield.attack(phillips);
        displayHumans();
        System.out.println("\r\n\tPhillips attacks Hatfield!\r\n");
        phillips.attack(hatfield);
        displayHumans();
        System.out.println("\r\n\tMcCoy attacks Hatfield!\r\n");
        mccoy.attack(hatfield);
        displayHumans();
    }

    private static void displayHumans() {
        System.out.println(String.format("\r\n\tHatfield\r\n%s", hatfield.toString()));
        System.out.println(String.format("\r\n\tMcCoy\r\n%s", mccoy.toString()));
        System.out.println(String.format("\r\n\tPhillips\r\n%s", phillips.toString()));
        pressEnterToContinue(true);
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void pressEnterToContinue(boolean clr) {
        System.out.println("\r\n\tPress <ENTER> to continue...");
        scanner.nextLine();
        if (clr) clearScreen();
    }
}