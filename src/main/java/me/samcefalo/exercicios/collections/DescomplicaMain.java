package me.samcefalo.exercicios.collections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DescomplicaMain {

    private static final int LIMIT = 5;

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (numbers.size() < LIMIT) {
                try {
                    System.out.println("Digite um número: ");
                    int number = scanner.nextInt();
                    numbers.add(number);
                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números inteiros!");
                    scanner.next();
                }
            }
        }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.printf("Lista: %s | Soma: %d", numbers, sum);
    }

}
