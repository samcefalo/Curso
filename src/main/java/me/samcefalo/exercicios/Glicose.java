package me.samcefalo.exercicios;

import java.util.Scanner;

public class Glicose {

    /*
    Problema "glicose"
    Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e depois mostrar na tela a
    classificação desta glicose de acordo com a tabela de referência ao lado.
    Normal: Até 100 mg/dl
    Elevado: Maior que 100 até 140 mg/dl
    Diabetes: Maior de 140 mg/dl
     */

    public static void main(String[] args) {
        double glicose;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a medida da glicose (mg/dl): ");
            glicose = sc.nextDouble();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        String resultado;

        if (glicose < 100) {
            resultado = "Normal";
        } else if (glicose < 140) {
            resultado = "Elevado";
        } else resultado = "Diabetes";

        System.out.print(String.format("Classificação: %s ", resultado));
    }
}
