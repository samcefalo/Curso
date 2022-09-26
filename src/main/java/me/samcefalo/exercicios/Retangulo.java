package me.samcefalo.exercicios;

import java.util.Scanner;

public class Retangulo {
    /*
    Problema "retangulo"
    Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
    da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
     */

    public static void main(String[] args) {
        double base = 0, altura = 0, area = 0, perimetro = 0, diagonal = 0;

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor da base: ");
            base = sc.nextDouble();
            System.out.print("Digite o valor da altura: ");
            altura = sc.nextDouble();
        } catch (Exception exception){
            System.out.print("ERRO!");
            return;
        }

        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

        System.out.println(String.format("Área: %.2f m² \n" +
                "Perímetro: %.2f m \n" +
                "Diagonal: %.2f m", area, perimetro, diagonal));
    }
}
