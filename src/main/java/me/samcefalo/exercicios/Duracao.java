package me.samcefalo.exercicios;

import java.util.Scanner;

public class Duracao {

    /*
    Problema "duracao"
    Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
    formato horas:minutos:segundos.
     */

    public static void main(String[] args) {
        int segundos = 0, minutos= 0, horas = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a duração em segundos: ");
            segundos = sc.nextInt();
        } catch (Exception exception) {
            System.out.println("ERRO!");
            return;
        }

        horas = segundos / 3600;
        int resto = segundos % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(String.format("Tempo: %s:%s:%s", horas, minutos, segundos));
    }

}
