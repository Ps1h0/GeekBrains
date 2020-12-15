package com.company;

import java.util.Random;
import java.util.Scanner;

public class FirstGame {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame(){
        Scanner scanner = new Scanner(System.in);
        int generatedNumber = generateNumber();
        System.out.println("Угадайте число от 0 до 9");
        int errCount = 0;
        while (errCount <3){
            System.out.print("Введите число: ");
            int enteredNumber = scanner.nextInt();
            if (generatedNumber > enteredNumber){
                System.out.println("Загаданное число больше");
                errCount++;
            }
            if (generatedNumber < enteredNumber){
                System.out.println("Загаданное число меньше");
                errCount++;
            }
            if (generatedNumber == enteredNumber){
                System.out.println("Вы угадали!");
                System.out.println("Повторим игру?\n 1 - Да \n 0 - Нет");
                int ans = scanner.nextInt();
                if(ans == 1)
                    startGame();
                else
                    System.exit(0);
            }
            if (errCount ==3){
                System.out.println("Попыток больше не осталось!");
                System.exit(-1);
            }
        }
    }

    public static int generateNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }
}
