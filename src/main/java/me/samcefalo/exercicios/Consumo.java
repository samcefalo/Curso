package me.samcefalo.exercicios;

import java.util.Scanner;

public class Consumo {

    /*
    Problema "consumo"
    Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
    combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
    médio do carro, com três casas decimais.
     */

    public static void main(String[] args) {
        int distancia = 0;
        double consumo = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a distância percorrida: ");
            distancia = sc.nextInt();
            System.out.print("Digite o consumo: ");
            consumo = sc.nextDouble();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        double media = distancia / consumo;

        System.out.print(String.format("Consumo médio: %.3f", media));
    }
}
