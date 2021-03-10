package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        createHero();
    }

    public static hero createHero() {
        hero[] nameHeroes = new hero[3];

        nameHeroes[0] = new hero("Magic");
        nameHeroes[1] = new hero("Strong");
        nameHeroes[2] = new hero("Big");


        for (int i = 0; i < 3; i++) {
            System.out.println(nameHeroes[i].name);
        }
    }
}
