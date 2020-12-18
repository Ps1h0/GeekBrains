package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер поля");
        int n = scanner.nextInt();
        char[][] field = createField(n);

        while (true) {

            drawField(field);

            doPlayerMove(field);
            if (checkWin(field, 'X')) {
                System.out.println("Player is winner!!!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Sorry, game is draw!!!");
                break;
            }

            doAIMove(field);
            if (checkWin(field, 'O')) {
                System.out.println("AI is winner!!!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Sorry, game is draw!!!");
                break;
            }
        }
    }

    static char[][] createField(int n) {
        char[][] field = new char[n][n];
        for (char[] row : field)
            Arrays.fill(row, '-');
        return field;
    }

    static void drawField(char[][] field) {
        for (char[] chars : field) {
            for (char aChar : chars)
                System.out.print(aChar);
            System.out.println();
        }
    }

    static void doPlayerMove(char[][] field) {
        int x, y;

        do {
            x = chooseCoordinate(field.length, 'X');
            y = chooseCoordinate(field.length, 'O');
        } while (field[x][y] != '-');

        field[x][y] = 'X';

        drawField(field);
        drawSeparator();
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int x, y;

        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (field[x][y] != '-');

        field[x][y] = 'O';
        drawField(field);
        drawSeparator();
    }

    static boolean checkWin(char[][] field, char sign) {
        for(int i = 0; i < field.length; i++){
            if ((field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) ||
                    (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign))
                return true;
            if ((field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) ||
                    (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign))
                return true;
        }
        return false;
    }

    static boolean checkDraw(char[][] field) {
        int freeCells = field.length * field.length;

        for (char[] chars : field) {
            for (char aChar : chars) {
                if (aChar != '-') {
                    freeCells--;
                }
            }
        }

        return freeCells == 0;
    }

    static int chooseCoordinate(int maxLength, char sign) {
        Scanner scanner = new Scanner(System.in);

        int coord;
        do {
            System.out.printf("Please enter %s-coord in range [1..%d]%n", sign, maxLength);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord >= maxLength);

        return coord;
    }

    static void drawSeparator() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
}