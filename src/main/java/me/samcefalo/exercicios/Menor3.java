package me.samcefalo.exercicios;

import java.util.Scanner;

public class Menor3 {

    /*
    Problema "menor_de_tres"
    Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
    números lidos. Em caso de empate, mostrar apenas uma vez.
     */

    public static void main(String[] args) {
        int a, b, c, menor;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor 1: ");
            a = sc.nextInt();
            System.out.print("Digite o valor 2: ");
            b = sc.nextInt();
            System.out.print("Digite o valor 3: ");
            c = sc.nextInt();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        menor = a;

        if (b < a && b < c) {
            menor = b;
        } else if (c < a && c < b) {
            menor = c;
        }

        System.out.print(String.format("Menor número: %s", menor));
    }
}
