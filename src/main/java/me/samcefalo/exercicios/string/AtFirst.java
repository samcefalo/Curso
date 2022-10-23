package me.samcefalo.exercicios.string;

public class AtFirst {

    /*
    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2,
    use '@' for the missing chars.

    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
     */

    public static void main(String[] args) {
        AtFirst af = new AtFirst();
        System.out.printf("At First 'hello': %s \n", af.atFirst("hello"));
        System.out.printf("At First 'hi': %s \n", af.atFirst("hi"));
        System.out.printf("At First 'h': %s \n", af.atFirst("h"));
        System.out.printf("At First '': %s \n", af.atFirst(""));
    }

    public String atFirst(String str) {
        String first = str;
        if (first.length() >= 2) {
            first = first.substring(0, 2);
        } else {
            while (first.length() < 2) {
                first = first + "@";
            }
        }
        return first;
    }

}
