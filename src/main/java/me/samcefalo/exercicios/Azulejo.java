package me.samcefalo.exercicios;

import java.util.Scanner;

public class Azulejo {

    /*
    Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede)
    precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo)
    e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e
    imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
     */
    public static void main(String[] main) {
        double hp = 0, lp = 0, ha = 0, la = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a Largura da Parede: ");
            lp = sc.nextDouble();
            System.out.print("Digite a Altura da Parede: ");
            hp = sc.nextDouble();
            System.out.print("Digite a Largura do Azulejo: ");
            la = sc.nextDouble();
            System.out.print("Digite a Altura do Azulejo: ");
            ha = sc.nextDouble();
        } catch (Exception e) {
            System.out.print("ERRO!");
            return;
        }

        double area_parede = hp * lp;
        double area_azulejo = ha * la;

        double diff = area_parede / area_azulejo;

        System.out.print(String.format("São precisos %.2f Azulejos para cobrir a parede de %.3f m².", diff, area_parede));

    }
}
