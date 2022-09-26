package me.samcefalo.exercicios;

import java.util.Scanner;

public class Circulo {
    /*
    Problema "circulo"
    Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
    círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟
    ଶ
    . Você pode usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
    diretamente o valor 3.14159
     */

    public static void main(String[] args) {
        double raio = 0, area = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o raio do circulo: ");
            raio = sc.nextDouble();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        area = Math.PI * Math.pow(raio,2);
        System.out.print(String.format("Área do círculo: %.3f", area));
    }
}
