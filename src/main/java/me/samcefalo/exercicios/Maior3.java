package me.samcefalo.exercicios;

import java.util.Scanner;

public class Maior3 {

    /*
    Problema "dardo"
    No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
    Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
    foi a maior.
     */

    public static void main(String[] args) {
        double a, b, c;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor do primeiro arremesso: ");
            a = sc.nextDouble();
            System.out.print("Digite o valor do segundo arremesso: ");
            b = sc.nextDouble();
            System.out.print("Digite o valor do terceiro arremesso: ");
            c = sc.nextDouble();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        double maior = a;

        if (b > a && b > c) {
            maior = b;
        } else if (c > a && c > b) {
            maior = c;
        }

        System.out.print(String.format("Maior distância: %.0f", maior));
    }
}
