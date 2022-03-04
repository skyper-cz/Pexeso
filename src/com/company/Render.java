package com.company;


import static com.company.Main.Hidden;
import static com.company.Main.Pole;

public class Render {
    public static void Vykresleni() {
        System.out.println();
        System.out.println("      1 2 3 4 5 6");

        for (int radek = 0; radek < Pole.length; radek++) {
            if (radek == 5) {
                System.out.print(" " + (radek + 1) + " | ");
            } else {
                System.out.print("  " + (radek + 1) + " | ");
            }

            for (int sloupec = 0; sloupec < Pole[radek].length; sloupec++) {
                if (Hidden[radek][sloupec] == 0){
                    System.out.print("# ");
                }
                else {
                    System.out.print(Pole[radek][sloupec] + " ");
                }
            }
            System.out.println("| " + radek);
        }
        System.out.println("      1 2 3 4 5 6");
        System.out.println();
    }
}
