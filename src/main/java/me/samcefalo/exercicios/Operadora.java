package me.samcefalo.exercicios;

import java.util.Scanner;

public class Operadora {

    /*
    Problema "operadora"
    Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
    telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
    ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
     */

    public static void main(String[] args) {
        int minutos;
        double custo_fixo = 50, custo_variavel = 2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de minutos: ");
            minutos = sc.nextInt();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        double excedente = minutos > 100 ? (minutos - 100) * custo_variavel : 0;
        double total = custo_fixo + excedente;

        System.out.print(String.format("Valor a pagar: %.2f R$", total));
    }
}
