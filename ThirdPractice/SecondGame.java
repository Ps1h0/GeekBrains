package com.company;

import java.util.Random;
import java.util.Scanner;

public class SecondGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int generatedNumber = random.nextInt(25);
        String generatedWord = words[generatedNumber];
        while (true){
            System.out.println("Угадайте слово");
            String enteredWord = scanner.nextLine();
            if (enteredWord.equals(generatedWord)){
                System.out.println("Вы угадали!");
                break;
            }else {
                String output = "";
                for (int i = 0; i < 15; i++){
                    if (i < generatedWord.length() && i < enteredWord.length() && generatedWord.charAt(i) == enteredWord.charAt(i)){
                        output += enteredWord.charAt(i);
                    }else
                        output += "#";
                }
                System.out.println(output);
            }
        }
    }
}
