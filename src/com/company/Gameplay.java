package com.company;

import java.util.Scanner;

import static com.company.Check.Kontrola;
import static com.company.Main.*;
import static com.company.Render.Vykresleni;

public class Gameplay {
    public static void Hra() {
        while (Hra) {
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Vykresleni();
            System.out.println("Zadejte souřadnici X");
            souradniceX = sc1.nextInt();
            int X = souradniceX;
            System.out.println("Zadejte souřadnici X");
            souradniceY = sc2.nextInt();
            int Y = souradniceY;
            Hidden[souradniceX][souradniceY] = 1;
            Vykresleni();
            System.out.println("Zadejte souřadnici X druhé kartičky");
            souradniceX = sc1.nextInt();
            System.out.println("Zadejte souřadnici Y druhé kartičky");
            souradniceY = sc2.nextInt();
            if (Pole[X][Y] == Pole[souradniceX][souradniceY]) {
                Hidden[souradniceX][souradniceY] = 1;
            }
            else {
                Hidden[X][Y] = 0;
            }
            Kontrola();
        }
        System.out.println("Gratuluji");
        System.out.println("Vyhrál si");

    }
}
