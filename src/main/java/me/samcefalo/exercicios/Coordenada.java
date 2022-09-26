package me.samcefalo.exercicios;

import java.util.Scanner;

public class Coordenada {

    /*
    Problema "coordenadas" (adaptado de URI 1041)
    Leia os valores das coordenadas X e Y de um ponto no plano
    cartesiano. A seguir, determine qual o quadrante ao qual pertence o
    ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
    mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
    “Eixo X” ou “Eixo Y”, conforme for a situação.
     */

    public static void main(String[] args) {
        double x, y;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor de x: ");
            x = sc.nextDouble();
            System.out.print("Digite o valor de y: ");
            y = sc.nextDouble();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        String resultado = "";

        if (x == 0 && y == 0) resultado = "Origem";
        if (x == 0 && y != 0) resultado = "Eixo X";
        if (x != 0 && y == 0) resultado = "Eixo Y";

        if(x > 0 && y > 0) resultado = "Q1";
        if(x > 0 && y < 0) resultado = "Q4";

        if(x < 0 && y > 0) resultado = "Q2";
        if(x < 0 && y < 0) resultado = "Q3";

        System.out.print(String.format("Resultado: %s", resultado));
    }
}
