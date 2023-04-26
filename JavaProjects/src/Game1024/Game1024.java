package Game1024;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Game1024 extends JFrame {

    public static int[][] board; //global variables
    public static int inputNum;
    public static int globalPointer = 0;

    public static void main(String[] args) {
        boolean bound = false;
        while (!bound) {
            bound = true;
            String input = JOptionPane.showInputDialog("Enter the board size you want between 4 and 10");
            try {
                inputNum = Integer.parseInt(input);
                if (inputNum < 4 || inputNum > 10) {
                    bound = false;
                }
            } catch (NumberFormatException e) {
                bound = false;
            }
        }
        board = new int[inputNum][inputNum];
        numGenerator(inputNum);
        printBoard();
        instructions();
        while (true) {
            nextMove();
        }
    }

    public static void printBoard() {
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("+-----");
            }
            System.out.print("+\n");
            for (int j = 0; j < cols; j++) {
                System.out.print("|");
                if (board[i][j] == 0) {
                    System.out.print("     ");
                } else if (board[i][j] < 10) {
                    System.out.print("  " + board[i][j] + "  ");
                } else if (board[i][j] < 100) {
                    System.out.print("  " + board[i][j] + " ");
                } else if (board[i][j] < 1000) {
                    System.out.print(" " + board[i][j] + " ");
                }
            }
            System.out.print("|\n");
        }
        for (int j = 0; j < cols; j++) {
            System.out.print("+-----");
        }
        System.out.print("+\n");
    }

    public static void numGenerator(int inputNum) {
        Random rand = new Random();
        int randrow1 = rand.nextInt(inputNum);
        int randcol1 = rand.nextInt(inputNum);
        int randrow2 = rand.nextInt(inputNum);
        int randcol2 = rand.nextInt(inputNum);
        while (randrow1 == randrow2 && randcol1 == randcol2) {
            randrow2 = rand.nextInt(inputNum);
            randcol2 = rand.nextInt(inputNum);
        }
        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum; j++) {
                if ((i == randrow1 && j == randcol1) || (i == randrow2 && j == randcol2)) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    public static void instructions() {
        System.out.println("How to Play");
        System.out.println("Press W to move up");
        System.out.println("Press S to move down");
        System.out.println("Press A to move left");
        System.out.println("Press D to move right");
        Scanner myObj = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            valid = true;
            System.out.println("Enter your move");
            char move = myObj.next().charAt(0);
            if (move == 'D' || move == 'd') {
                moveRight(inputNum);
            } else if (move == 'A' || move == 'a') {
                moveLeft(inputNum);
            } else if (move == 'W' || move == 'w') {
                moveUp(inputNum);
            } else if (move == 'S' || move == 's') {
                moveDown(inputNum);
            } else {
                valid = false;
                System.out.println("Incorrect move");
                printBoard();
            }
        }
    }

    public static void nextMove() {
        Scanner myObj = new Scanner(System.in);
        boolean valid = false;


        while (!valid) {
            valid = true;
            System.out.println("Enter your next move");
            char move = myObj.next().charAt(0);
            if (move == 'D' || move == 'd') {
                moveRight(inputNum);
            } else if (move == 'A' || move == 'a') {
                moveLeft(inputNum);
            } else if (move == 'W' || move == 'w') {
                moveUp(inputNum);
            } else if (move == 'S' || move == 's') {
                moveDown(inputNum);
            } else {
                valid = false;
                System.out.println("Incorrect move");
                printBoard();
            }
        }
    }

    public static void moveRight(int inputNum) {
        for (int row = 0; row < inputNum; row++) {
            globalPointer = inputNum - 1;
            for (int col = inputNum - 1; col >= 0; col--) {
                if (board[row][col] != 0) {
                    if (globalPointer >= col) {
                        shiftColTiles(row, col, true);
                    }
                }
            }
        }
        generateNewNumber(board);

        printBoard();
    }

    public static void moveLeft(int inputNum) {
        for (int row = 0; row < inputNum; row++) {
            globalPointer = 0;
            for (int col = 0; col < inputNum; col++) {
                if (board[row][col] != 0) {
                    if (globalPointer <= col) {
                        shiftColTiles(row, col, false);
                    }
                }
            }
        }
        generateNewNumber(board);
        printBoard();
    }

    public static void moveDown(int inputNum) {
        for (int col = 0; col < inputNum; col++) {
            globalPointer = inputNum - 1;
            for (int row = inputNum - 1; row >= 0; row--) {
                if (board[row][col] != 0) {
                    if (globalPointer >= row) {
                        shiftRowTiles(row, col, true);
                    }
                }
            }
        }
        generateNewNumber(board);
        printBoard();
    }

    public static void moveUp(int inputNum) {
        for (int col = 0; col < inputNum; col++) {
            globalPointer = 0;
            for (int row = 0; row < inputNum; row++) {
                if (board[row][col] != 0) {
                    if (globalPointer <= row) {
                        shiftRowTiles(row, col, false);
                    }
                }
            }
        }
        generateNewNumber(board);
        printBoard();

    }

    public static void shiftRowTiles(int currentRow, int currentCol, boolean reverse) {
        if (board[globalPointer][currentCol] == 0 || board[globalPointer][currentCol] == board[currentRow][currentCol]) {
            if (currentRow > globalPointer || (reverse && (globalPointer > currentRow))) {
                board[globalPointer][currentCol] += board[currentRow][currentCol];
                board[currentRow][currentCol] = 0;
            }
        } else {
            if (reverse) {
                globalPointer--;
            } else {
                globalPointer++;
            }
            shiftRowTiles(currentRow, currentCol, reverse);
        }
    }

    public static void shiftColTiles(int currentRow, int currentCol, boolean reverse) {
        if (board[currentRow][globalPointer] == 0 || board[currentRow][globalPointer] == board[currentRow][currentCol]) {
            if (currentCol > globalPointer || (reverse && (globalPointer > currentCol))) {
                board[currentRow][globalPointer] += board[currentRow][currentCol];
                board[currentRow][currentCol] = 0;
            }
        } else {
            if (reverse) {
                globalPointer--;
            } else {
                globalPointer++;
            }
            shiftColTiles(currentRow, currentCol, reverse);
        }
    }
    public static void generateNewNumber(int[][] board) {
        Random rand = new Random();
        int row, col;
        do {
            row = rand.nextInt(board.length);
            col = rand.nextInt(board[0].length);
        } while (board[row][col] != 0);
        board[row][col] = rand.nextInt(2) == 0 ? 1 : 2;
    }
}


