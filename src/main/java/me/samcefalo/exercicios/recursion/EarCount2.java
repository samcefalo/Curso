package me.samcefalo.exercicios.recursion;

public class EarCount2 {
    /*
    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2
    ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    Recursively return the number of "ears" in the bunny line 1, 2, ... n
    (without loops or multiplication).

    bunnyEars2(0) → 0
    bunnyEars2(1) → 2
    bunnyEars2(2) → 5
     */

    public static void main(String[] args) {
        EarCount2 ec = new EarCount2();
        System.out.printf("Amount of Ears (0): %d \n", ec.bunnyEars(0));
        System.out.printf("Amount of Ears (1): %d \n", ec.bunnyEars(1));
        System.out.printf("Amount of Ears (2): %d \n", ec.bunnyEars(2));
        System.out.printf("Amount of Ears (4): %d \n", ec.bunnyEars(4));
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        //verify if is odd or pair
        int count = bunnies % 2 == 0 ? 3 : 2;
        return count + bunnyEars(bunnies - 1);
    }
}
