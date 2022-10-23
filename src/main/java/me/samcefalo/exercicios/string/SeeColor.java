package me.samcefalo.exercicios.string;

public class SeeColor {
    /*
    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.

    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
     */

    public static void main(String[] args) {
        SeeColor sc = new SeeColor();
        System.out.printf("See Color 'redxx': %s \n", sc.seeColor("redxx"));
        System.out.printf("See Color 'xxred': %s \n", sc.seeColor("xxred"));
        System.out.printf("See Color 'blueTimes': %s \n", sc.seeColor("blueTimes"));
        System.out.printf("See Color 'asd': %s \n", sc.seeColor("asd"));
    }

    public String seeColor(String str) {
        String color = "";

        if (str.startsWith("red")) {
            color = "red";
        } else if (str.startsWith("blue")) {
            color = "blue";
        }

        return color;
    }
}
