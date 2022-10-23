package me.samcefalo.exercicios.recursion;

public class Factorial {

    /*
    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
    Compute the result recursively (without loops).

    factorial(1) → 1
    factorial(2) → 2
    factorial(3) → 6
     */

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.printf("Factorial of 1: %d \n", f.factorial(1));
        System.out.printf("Factorial of 2: %d \n", f.factorial(2));
        System.out.printf("Factorial of 3: %d \n", f.factorial(3));
        System.out.printf("Factorial of 4: %d \n", f.factorial(4));
        System.out.printf("Factorial of 5: %d \n", f.factorial(5));
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * this.factorial(n - 1);
    }
}
