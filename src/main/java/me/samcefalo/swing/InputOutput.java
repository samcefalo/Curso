package me.samcefalo.swing;

import javax.swing.*;

public class InputOutput {

    public static void main(String[] args){
        int i1, i2;
        double quociente, potencia;
        String resultado = "";

        i1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        i2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));

        quociente = i1/i2;
        potencia = Math.pow(i1, i2);

        resultado += String.format("O quociente de %d e %d é %.2f.\n", i1, i2, quociente);
        resultado += String.format("A potência de %d^%d é %.2f.", i1, i2, potencia);

        JOptionPane.showMessageDialog(null, resultado);

        System.exit(0);
    }
}
