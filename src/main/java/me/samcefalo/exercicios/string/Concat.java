package me.samcefalo.exercicios.string;

public class Concat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result. However,
    if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
     */

    public static void main(String[] args) {
        Concat c = new Concat();
        System.out.printf("Concat 'abc, cat': %s \n", c.conCat("abc", "cat"));
        System.out.printf("Concat 'dog, cat': %s \n", c.conCat("dog", "cat"));
        System.out.printf("Concat 'cat, t': %s \n", c.conCat("cat", "t"));
        System.out.printf("Concat 'abc,': %s \n", c.conCat("abc", ""));
    }

    public String conCat(String a, String b) {
        String concat = a + b;
        String lastA = a.length() > 0 ? a.charAt(a.length() - 1) + "" : "";
        String firstB = b.length() > 0 ? b.charAt(0) + "" : "";

        if(lastA.equals(firstB)){
         concat = a + b.substring(1);
        }
        return concat;
    }
}
