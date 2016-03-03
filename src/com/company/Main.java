package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber = enterFirstNumb();
        char operator = enterOperator();
        int twoNumber = enterTwoNumber();
        results(operator, firstNumber, twoNumber);
        recursionMetod(firstNumber,operator,twoNumber);
    }

    public static int enterFirstNumb() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first number");
        String enterFirstNumb = in.nextLine();
        Integer i2 = Integer.valueOf(enterFirstNumb);
        return i2;
    }

    public static char enterOperator() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your operator");
        String enterOperator = in.nextLine();
        return enterOperator.charAt(0);
    }

    public static int enterTwoNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your two number");
        String enterTwoNumb = in.nextLine();
        Integer i3 = Integer.valueOf(enterTwoNumb);
        return i3;
    }

    public static void results(char operator, int firstNumber, int twoNumber) {
        if (operator == '+') {
            System.out.println("Result");
            System.out.println(firstNumber + twoNumber);
            recursionMetod(firstNumber,operator,twoNumber);
        } else if (operator == '-') {
            System.out.println("Result");
            System.out.println(firstNumber - twoNumber);
            recursionMetod(firstNumber,operator,twoNumber);
        } else if (operator == '*') {
            System.out.println("Result");
            System.out.println(firstNumber * twoNumber);
            recursionMetod(firstNumber,operator,twoNumber);
        } else if (operator == '/') {
            System.out.println("Result");
            System.out.println(firstNumber / twoNumber);
            recursionMetod(firstNumber,operator,twoNumber);
        }
    }

    public static void recursionMetod(int firstNumber, char operator, int twoNumber) {
        firstNumber = enterFirstNumb();
        operator = enterOperator();
        twoNumber = enterTwoNumber();
        results(operator, firstNumber, twoNumber);
    }

}
