package com.company;

import static com.company.Gameplay.Hra;
import static com.company.Michani.Mix;

public class Main {

    public static int[][] Pole = new int[6][6];
    public static int[][] Hidden = new int[6][6];
    public static int souradniceX;
    public static int souradniceY;
    public static boolean Hra = true;

    public static void main(String[] args) {
        for (int x = 0; x < 5; x++){
            for (int y = 0; y < 5; y++){
                Hidden[x][y] = 0;
            }
        }
        System.out.println("Vítej hráči");
        System.out.println("Je čas na pexeso");
        Mix();
        System.out.println("Pole nachystáno");
        System.out.println("Hodně štěstí hráči");
        Hra();
    }
}
