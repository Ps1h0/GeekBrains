package com.company;

public class Main {
    //1 exercise
    public static void main(String[] args) {
	    //2 exercise
        byte a = 12;
	    short b= 228;
	    int c = 228;
	    long d = 2456L;
	    float e = 35.4F;
	    double f = 35.45;
	    char g = 'a';
	    String h = "hello";
	    boolean isTrue = true;
	    boolean isFalse = false;

        System.out.println(calculate(3, 4, 5, 6));
        System.out.println(checkSum(4, 8));
        checkPositive(-4);
        System.out.println(checkPositiveWithReturn(-5));
        sayHello("Nikita");
        checkLeapYear(2025);
    }
    //3 exercise
    public static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    //4 exercise
    public static boolean checkSum(int a, int b){
        return (a + b) >= 10 && (a + b) <= 20;
    }

    //5 exercise
    public static void checkPositive(int a){
        if (a >= 0)
            System.out.println("positive");
        else
            System.out.println("negative");
    }

    //6 exercise
    public static boolean checkPositiveWithReturn(int a){
        return a < 0;
    }

    //7 exercise
    public static void sayHello(String name){
        System.out.println("Hello, " + name + "!");
    }

    //8 exercise
    public static void checkLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
