package me.samcefalo.teorico;

public class Exceptions {

    public static void main(String[] args) throws Exception {
        int value = 0;

        try {
            value = 1;
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(value);
    }
}
