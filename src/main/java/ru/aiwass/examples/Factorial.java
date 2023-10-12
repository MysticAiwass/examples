package ru.aiwass.examples;

import java.util.Scanner;

public class Factorial {

    //Рекурсивное вычисление Факториала:
    //Напишите метод для вычисления факториала числа с использованием рекурсии.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answerUser = scanner.nextInt();

        System.out.println(factorial(answerUser));
        System.out.println(reverseFactorial(factorial(answerUser)));
    }

    private static StringBuilder reverseFactorial(int factorial) {
        String strFactorial = String.valueOf(factorial);
        StringBuilder buffer = new StringBuilder();
        for (int i = strFactorial.length() - 1; i >= 0; i--) {
           buffer.append(strFactorial.charAt(i));
        }
        return buffer;
    }

    private static int factorial(int answerUser) {
        int result = 1;
        for (int i = 1; i <= answerUser; i++) {
            result = result * i;
        }
        return result;
    }

}
