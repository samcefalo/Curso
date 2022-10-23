package me.samcefalo.exercicios.recursion;

public class EarCount {
    /*
    We have a number of bunnies and each bunny has two big floppy ears.
    We want to compute the total number of ears across all the bunnies recursively
    (without loops or multiplication).

    bunnyEars(0) → 0
    bunnyEars(1) → 2
    bunnyEars(2) → 4
     */

    public static void main(String[] args){
        EarCount ec = new EarCount();
        System.out.printf("Amount of Ears (0): %d \n", ec.bunnyEars(0));
        System.out.printf("Amount of Ears (1): %d \n", ec.bunnyEars(1));
        System.out.printf("Amount of Ears (2): %d \n", ec.bunnyEars(2));
        System.out.printf("Amount of Ears (4): %d \n", ec.bunnyEars(4));
    }

    public int bunnyEars(int bunnies){
        if(bunnies == 0) return 0;

        return 2 + bunnyEars(bunnies - 1);
    }
}
