package me.samcefalo.exercicios.string;

public class HasBad {
    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
    Note: use .equals() to compare 2 strings.

    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
     */

    public static void main(String[] args) {
        HasBad hb = new HasBad();
        System.out.printf("Has Bad? 'badxx': %s \n", hb.hasBad("badxx"));
        System.out.printf("Has Bad? 'xbadxx': %s \n", hb.hasBad("xbadxx"));
        System.out.printf("Has Bad? 'xxbadxx': %s \n", hb.hasBad("xxbadxx"));
        System.out.printf("Has Bad? 'xx': %s \n", hb.hasBad("xx"));
    }

    public boolean hasBad(String str) {
        String split = str;
        if (split.length() >= 3 && split.startsWith("bad")) {
            return true;
        }
        return split.length() >= 4 && split.startsWith("bad", 1);
    }
}
