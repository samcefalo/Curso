package me.samcefalo.teorico;

import java.util.Date;

public class Format {

    public static void main(String[] args) {
        /*
        format %.2f => duas casas decimais
        format %,.2f => duas casas decimais com ponto (moedas)
        format %s => String
        format %t => Date
        format %d => Número
         */
        double x;
        int idade = 21;
        String nome = "Samuel";
        String sobrenome = "Céfalo";
        x = 2.3456;
        Date data = new Date();

        System.out.printf("2 Casas decimais: %.2f%n", x);
        System.out.printf("1 Casa decimal: %.1f%n", x);
        System.out.printf("Meu nome é %s %s e tenho %d anos%n", nome, sobrenome, idade);
        System.out.printf("Horário: %tT%n", data);
        System.out.printf("Data: %tD%n", data);
        System.out.printf("Mês: %tB%n", data);
        System.out.printf("Timestamp: %ts%n", data);
    }
}
