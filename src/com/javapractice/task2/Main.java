package com.javapractice.task2;
/*
Реализуй метод main(String[]), который:

1. Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
2. Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
3. Инициализирует двумерный массив multiArray:
    количеством строк N;
    строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
 */
public class Main {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner inputLength = new Scanner(System.in);
        int temp;
        int length = inputLength.nextInt();
        multiArray = new int[length][];

        for (int i = 0; i < multiArray.length; i++) {
            temp = inputLength.nextInt();
            multiArray[i] = new int[temp];
        }
    }
}
