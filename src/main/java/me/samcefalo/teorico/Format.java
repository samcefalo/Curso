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

        System.out.println(String.format("2 Casas decimais: %.2f", x));
        System.out.println(String.format("1 Casa decimal: %.1f", x));
        System.out.println(String.format("Meu nome é %s %s e tenho %d anos", nome, sobrenome, idade));
        System.out.println(String.format("Horário: %tT", data));
        System.out.println(String.format("Data: %tD", data));
        System.out.println(String.format("Mês: %tB", data));
        System.out.println(String.format("Timestamp: %ts", data));
    }
}
