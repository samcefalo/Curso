package me.samcefalo.exercicios;

import java.util.Scanner;

public class Idade {
    /*
    Problema "idades"
    Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
    nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
     */

    public static void main(String[] args) {
        String nome1 = "", nome2 = "";
        int idade1 = 0, idade2 = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o primeiro nome: ");
            nome1 = sc.next();
            System.out.print("Digite a primeira idade: ");
            idade1 = sc.nextInt();
            System.out.print("Digite o segundo nome: ");
            nome2 = sc.next();
            System.out.print("Digite a segunda idade: ");
            idade2 = sc.nextInt();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        double media = (idade1 + idade2) / 2;

        System.out.print(String.format("A idade média entre %s e %s é %.0f", nome1, nome2, media));
    }
}
