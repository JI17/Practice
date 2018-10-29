package ru.acmp;
//Дана последовательность целых чисел. Требуется найти подпоследовательность заданной последовательности
// с максимальным модулем суммы входящих в нее чисел. Напомним, что модуль целого числа x равняется x,
// если x ≥ 0 и -x, если x < 0.
//
//Входные данные
//Первая строка входного файла INPUT.TXT содержит натуральное число n (1 ≤ n ≤ 10000) - длину последовательности.
// Во второй строке записаны n целых чисел, по модулю не превосходящих 10000.
//
//Выходные данные
//В первой строке выходного файла OUTPUT.TXT выведите длину k выбранной вами подпоследовательности.
// Во второй строке должны быть записаны k различных чисел, разделенных пробелами - номера выбранных членов последовательности.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String getArrInt(int[] arr) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return Arrays.toString(arr);
    }

    public static int getArrNoZero(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[scanner.nextInt()];

        getArrInt(arr);
        getArrNoZero(arr);
    }

}
