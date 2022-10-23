package me.samcefalo.exercicios.string;

public class LastChar {
    /*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
     */

    public static void main(String[] args) {
        LastChar lc = new LastChar();
        System.out.printf("Last Chars 'last, chars': %s \n", lc.lastChars("last", "chats"));
        System.out.printf("Last Chars 'yo, java': %s \n", lc.lastChars("yo", "java"));
        System.out.printf("Last Chars 'hi,': %s \n", lc.lastChars("hi", ""));
        System.out.printf("Last Chars ',': %s \n", lc.lastChars("", ""));
    }

    public String lastChars(String a, String b) {
        String first = a.length() > 0 ? a.charAt(0) + "" : "@";
        String last = b.length() > 0 ? b.charAt(b.length() - 1) + "" : "@";

        return first + last + "";
    }
}
