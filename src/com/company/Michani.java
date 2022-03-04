package com.company;

import java.util.Random;

import static com.company.Main.Pole;

public class Michani {
    public static void Mix() {
        for (int i = 1; i < 18; i++) {
            for (int z = 0; z < 2; z++) {
                Random randomGenerator = new Random();
                int X = randomGenerator.nextInt(6);
                int Y = randomGenerator.nextInt(6);

                if (Pole[Y][X] != 0) {
                    z--;
                } else {
                    Pole[Y][X] = i;
                }
            }
        }
    }
}
