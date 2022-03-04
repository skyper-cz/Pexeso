package com.company;

import java.util.Scanner;

import static com.company.Check.Kontrola;
import static com.company.Main.*;
import static com.company.Render.Vykresleni;

public class Gameplay {
    public static void Hra() {
        while (Hra) {
            boolean jeden = true;
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);

            Vykresleni();
            while (jeden) {
                System.out.println("Zadejte souřadnici Y");
                souradniceX = sc1.nextInt();
                if (souradniceX > 6) {
                    System.out.println("Číslo mimo pole");
                    System.out.println("Zadejte nové číslo");
                } else {
                    jeden = false;
                }
            }
            jeden = true;
            while (jeden) {
                System.out.println("Zadejte souřadnici X");
                souradniceY = sc2.nextInt();
                if (souradniceY > 6) {
                    System.out.println("Číslo mimo pole");
                    System.out.println("Zadejte nové číslo");
                } else {
                    jeden = false;
                }
            }
            jeden = true;
            Hidden[souradniceX - 1][souradniceY - 1] = 1;
            Vykresleni();
            while(jeden) {
                System.out.println("Zadejte souřadnici Y druhé kartičky");
                souradniceX2 = sc1.nextInt();
                if (souradniceX2 > 6) {
                    System.out.println("Číslo mimo pole");
                    System.out.println("Zadejte nové číslo");
                } else {
                    jeden = false;
                }
            }
            jeden = true;
            while (jeden) {
                System.out.println("Zadejte souřadnici X druhé kartičky");
                souradniceY2 = sc2.nextInt();
                if (souradniceY2 > 6) {
                    System.out.println("Číslo mimo pole");
                    System.out.println("Zadejte nové číslo");
                } else {
                    jeden = false;
                }
            }
            Hidden[souradniceX2 - 1][souradniceY2 - 1] = 1;
            Vykresleni();
            if (Pole[souradniceX2 - 1][souradniceY2 - 1] == Pole[souradniceX - 1][souradniceY - 1]) {
                System.out.println("JE TO PÁR");
            }
            else {
                Hidden[souradniceX2 - 1][souradniceY2 -1] = 0;
                Hidden[souradniceX - 1][souradniceY - 1] = 0;
                System.out.println("NENÍ TO PÁR");
            }
            Kontrola();
        }
        System.out.println("Gratuluji");
        System.out.println("Vyhrál si");

    }
}
