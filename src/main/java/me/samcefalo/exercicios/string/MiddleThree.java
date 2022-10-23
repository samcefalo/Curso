package me.samcefalo.exercicios.string;

public class MiddleThree {

    /*
    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.

    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
     */

    public static void main(String[] args) {
        MiddleThree mt = new MiddleThree();
        System.out.printf("Middle Three 'Candy': %s \n", mt.middleThree("Candy"));
        System.out.printf("Middle Three 'and': %s \n", mt.middleThree("and"));
        System.out.printf("Middle Three 'and': %s \n", mt.middleThree("solving"));
    }

    public String middleThree(String str) {
        String middle = str;
        if (str.length() >= 3) {
            middle = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        }
        return middle;
    }
}
