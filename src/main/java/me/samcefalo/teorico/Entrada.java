package me.samcefalo.teorico;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        /*
        Scanner closeable -> precisa ser fechado
        try(Closeable) -> fecha automaticamente
         */

        int numero = 0;
        System.out.print("Digite um número: ");
        try (Scanner sc = new Scanner(System.in)) {
            numero = sc.nextInt();
        } catch (Exception exception) {
            System.out.print("ERRO!!");
            return;
        }

        System.out.println(String.format("Número: %s", numero));
    }
}
