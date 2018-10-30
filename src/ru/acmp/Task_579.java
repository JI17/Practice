package ru.acmp;
//Дана последовательность целых чисел. Требуется найти подпоследовательность заданной последовательности
// с максимальным модулем суммы входящих в нее чисел. Напомним, что модуль целого числа x равняется x,
// если x ≥ 0 и -x, если x < 0.
//
//Входные данные
//Первая строка входного файла input.txt содержит натуральное число n (1 ≤ n ≤ 10000) - длину последовательности.
// Во второй строке записаны n целых чисел, по модулю не превосходящих 10000.
//
//Выходные данные
//В первой строке выходного файла output.txt выведите длину k выбранной вами подпоследовательности.
// Во второй строке должны быть записаны k различных чисел, разделенных пробелами - номера выбранных членов последовательности.

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_579 {
    public static void main(String[] args) throws IOException {
        Task_579.run();
    }

    private static void run() throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        int[] numbs = readNumbs(sc);

        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] > 0) {
                countPositive += numbs[i];
                positiveNumbers.add(i);
            } else if (numbs[i] < 0) {
                countNegative += Math.abs(numbs[i]);
                negativeNumbers.add(i);
            }
        }

        PrintWriter pw = new PrintWriter(new File("output.txt"));
        if (countPositive > countNegative) {
            pw.print(positiveNumbers.size());
            pw.println();
            for (int s : positiveNumbers) {
                pw.print(s + 1 + " ");
            }
        } else {
            pw.print(negativeNumbers.size());
            pw.println();
            for (int s : negativeNumbers) {
                pw.print(s + 1 + " ");
            }
        }
        pw.close();
    }

    private static int[] readNumbs(Scanner sc) {
        sc.useDelimiter(System.getProperty("line.separator"));
        int sequenceLength = sc.nextInt();
        String readNumbs = sc.next();

        String[] str = readNumbs.split(" ");
        int[] numbs = new int[sequenceLength];
        for (int i = 0; i < sequenceLength; i++) {
            numbs[i] = Integer.parseInt(str[i]);
        }
        return numbs;
    }
}
