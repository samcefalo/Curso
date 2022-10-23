package me.samcefalo.exercicios.recursion;

public class Fibonacci {
    /*
    The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
    The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is
    the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing
    the start of the sequence.

    fibonacci(0) → 0
    fibonacci(1) → 1
    fibonacci(2) → 1
     */

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        System.out.printf("Fibonacci (0): %d \n", fb.fibonacci(0));
        System.out.printf("Fibonacci (1): %d \n", fb.fibonacci(1));
        System.out.printf("Fibonacci (2): %d \n", fb.fibonacci(2));
        System.out.printf("Fibonacci (3): %d \n", fb.fibonacci(3));
        System.out.printf("Fibonacci (5): %d \n", fb.fibonacci(5));
    }

    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
