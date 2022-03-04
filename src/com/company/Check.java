package com.company;

import static com.company.Main.*;

public class Check {
    public static void Kontrola(){
        int count = 0;
        for (int x = 0; x < 6; x++){
            for (int y = 0; y < 6; y++){
                if (Hidden[x][y] == 1){
                    count++;
                }
            }
        }
        if (count == 36) {
            Hra = false;
        }
    }
}
