package me.samcefalo.exercicios;

import java.util.Scanner;

public class Troco {
    /*
    Problema "troco"
    Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
    O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
    e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
    mostrar o valor do troco a ser devolvido ao cliente.
     */

    public static void main(String[] args) {
        double preco = 0, dinheiro = 0;
        int quantidade = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o preço do produto: ");
            preco = sc.nextDouble();
            System.out.print("Digite a quantidade de produtos: ");
            quantidade = sc.nextInt();
            System.out.print("Digite o valor pago pelo cliente: ");
            dinheiro = sc.nextDouble();
        } catch (Exception exception) {
            System.out.print("ERRO!");
            return;
        }

        double total = preco * quantidade;
        double troco = dinheiro - total;

        if (dinheiro < total) {
            System.out.print("Dinheiro pago insuficiente.");
            return;
        }

        System.out.print(String.format("Compra realizada com sucesso. \n" +
                "Total: %,.2f R$ \n" +
                "Pago: %,.2f R$ \n" +
                "Troco: %,.2f R$", total, dinheiro, troco));
    }
}
