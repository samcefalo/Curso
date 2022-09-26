package me.samcefalo.exercicios;

import java.util.Scanner;

public class Terreno {
    /*
    Problema "terreno"
    Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
    casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
    o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
    duas casas decimais, conforme exemplo.
     */

    public static void main(String[] args) {
        double comprimento = 0, largura = 0, valor_metroQuadrado = 0, area = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a largura do terreno: ");
            largura = sc.nextDouble();
            System.out.print("Digite o comprimento do terreno: ");
            comprimento = sc.nextDouble();
            System.out.print("Digite o valor do metro quadrado: ");
            valor_metroQuadrado = sc.nextDouble();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        area = comprimento * largura;
        double valor_terreno = valor_metroQuadrado * area;

        System.out.println(String.format("Área do terreno: %.2fm²", area));
        System.out.println(String.format("Valor do terreno: %,.2f R$", valor_terreno));
    }
}
