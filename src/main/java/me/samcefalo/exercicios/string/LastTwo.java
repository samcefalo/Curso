package me.samcefalo.exercicios.string;

public class LastTwo {

    /*
    Given a string of any length, return a new string where the last 2 chars, if present,
    are swapped, so "coding" yields "codign".

    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
     */
    public static void main(String[] args) {
        LastTwo lt = new LastTwo();
        System.out.printf("Last Two 'coding': %s \n", lt.lastTwo("coding"));
        System.out.printf("Last Two 'cat': %s \n", lt.lastTwo("cat"));
        System.out.printf("Last Two 'ab' %s \n", lt.lastTwo("ab"));
    }

    public String lastTwo(String str) {
        String swap = str;
        if (swap.length() >= 2) {
            String penultimate = swap.charAt(swap.length() - 2) + "";
            String last = swap.charAt(swap.length() - 1) + "";
            swap = swap.substring(0, swap.length() - 2) + last + penultimate;
        }

        return swap;
    }
}
