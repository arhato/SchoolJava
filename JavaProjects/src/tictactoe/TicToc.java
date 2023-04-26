package tictactoe;

import java.util.Scanner;

public class TicToc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int SIZE = 3;

        char[][] grid = new char[SIZE][SIZE];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = ' ';
            }
        }


        char player = 'X';


        while (true) {
            display(grid);

            int rowSelect;
            int colSelect;

            boolean validMove = true;

            System.out.println("It is " + player + "'s move");

            do {
                validMove = true;
                System.out.println("Please enter row number: ");
                rowSelect = in.nextInt() - 1;

                System.out.println("Please enter column number: ");
                colSelect = in.nextInt() - 1;

                if (rowSelect < 0 || colSelect < 0 || rowSelect >= SIZE || colSelect >= SIZE || grid[rowSelect][colSelect] != ' ') {
                    validMove = false;
                    System.out.println("Not a valid move. Try again");
                }


            } while (validMove == false);


            grid[rowSelect][colSelect] = player;


            if (player == 'X') player = 'O';
            else player = 'X';
        }


    }

    public static void display(char[][] grid) {
        System.out.print("  ");
        for (int col = 0; col < grid[0].length; col++) {
            System.out.print(" " + (col + 1) + "  ");
        }
        System.out.println();

        for (int row = 0; row < grid.length; row++) {
            System.out.print(" " + (row + 1) + " ");

            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col]);
                if (col < grid[row].length - 1) System.out.print(" | ");
            }
            System.out.println();

            if (row < grid.length - 1) {
                System.out.print("   ");
                for (int col = 0; col < grid[row].length; col++) {
                    System.out.print("-");
                    if (col < grid[row].length - 1) System.out.print("-+-");
                }
                System.out.println();
            }


        }
        System.out.println();
    }

}
