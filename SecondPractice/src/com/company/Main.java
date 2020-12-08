package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] secondArray = new int[8];
        replace(array);
        fillArray(secondArray);
        doTask3();
        doTask4();
        findMinAndMax();
        int[] thirdArray = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(doTask6(thirdArray));
        int[] fourthArray = {1, 2, 3};
        doTask7(fourthArray, -1);
        System.out.println(Arrays.toString(fourthArray));
    }
    //1 exercise
    public static void replace(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0)
                array[i] = 1;
            else
                array[i] = 0;
        }
    }

    //2 exercise
    public static void fillArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i * 3;
        }
    }

    //3 exercise
    public static void doTask3(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6)
                array[i] *= 2;
        }
    }

    //4 exercise
    public static void doTask4(){
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i == j)
                    array[i][j] = 1;
            }
        }
    }

    //5 exercise
    public static void findMinAndMax(){
        int[] array = {5, 6, 8, 12, 21, 0, -4, -41, -44};
        int min = array[0], max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
    }

    //6 exercise
    public static boolean doTask6(int[] array){
        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (j < i)
                    sumLeft += array[j];
                else
                    sumRight += array[j];
            }
            if (sumLeft == sumRight)
                return true;
            else{
                sumLeft = 0;
                sumRight = 0;
            }
        }
        return false;
    }

    //7 exercise
    public static void doTask7(int[] array, int n){
        if (n > 0){
            for (int i = 0; i < n; i++){
                int a = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--){
                    array[j] = array[j - 1];
                }
                array[0] = a;
            }
        }
        if (n < 0){
            for (int i = 0; i < Math.abs(n); i++){
                int a = array[0];
                for (int j = 0; j < array.length - 1; j++){
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = a;
            }
        }
    }
}
