package me.samcefalo.teorico;

public class Matriz {

    public static void main(String[] args) {

        int[][] grid = new int[20][20];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }

    }
}
