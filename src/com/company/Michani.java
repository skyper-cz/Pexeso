package com.company;

import java.util.Random;

import static com.company.Main.Pole;

public class Michani {
    public static void Mix() {
        for (int i = 1; i < 18; i++) {
            System.out.println("Hodnoty načteny");
            for (int z = 0; z < 2; z++) {
                System.out.println("Vybírám souřadnice");
                Random randomGenerator = new Random();
                int X = randomGenerator.nextInt(5);
                int Y = randomGenerator.nextInt(5);

                System.out.println("Kontroluji obsazenost");

                if (Pole[X][Y] != 0) {
                    z--;
                } else {
                    Pole[X][Y] = i;
                }
            }
        }
    }
}
