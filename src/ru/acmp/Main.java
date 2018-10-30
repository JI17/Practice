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

    int count = 0;


     String getArrInt(int[] arr) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return Arrays.toString(arr);
    }

     void getArrNoZero(int arr[]) {
         int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {

                count++;
            }
        }
        System.out.println(count);
    }



    public static void main(String[] args) throws FileNotFoundException {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[scanner.nextInt()];
        int newarr[] = new int[main.count];

        main.getArrInt(arr);
        main.getArrNoZero(arr);

    }

}
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Main.run();
//    }
//
//    private static void run() throws IOException {
//        PrintWriter pw;
//        Scanner sc;
//        sc = new Scanner(new File("INPUT.TXT"));
//        sc.useDelimiter(System.getProperty("line.separator"));
//        int countOfNums = sc.nextInt();
//        String readNums =  sc.next();
//
//        String[] str = readNums.split(" ");
//        int[] nums = new int[str.length];
//        for (int i = 0; i < str.length; i++) {
//            nums[i] = Integer.parseInt(str[i]);
//        }
//
//        sc.close();
//
//        List<Integer> indexPlus = new ArrayList<>(nums.length);
//        List<Integer> indexMinus = new ArrayList<>(nums.length);
//        int sumPlus = 0;
//        int sumMinus = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                sumPlus += nums[i];
//                indexPlus.add(i);
//            }
//            else if (nums[i] < 0 ){
//                sumMinus += Math.abs(nums[i]);
//                indexMinus.add(i);
//            }
//        }
//
//        pw = new PrintWriter(new File("OUTPUT.TXT"));
//        if (sumPlus > sumMinus) {
//            pw.print(indexPlus.size()  );
//            pw.println();
//            for (int s : indexPlus) {
//                pw.print(s + 1 +  " ");
//            }
//        }
//        else {
//            pw.print(indexMinus.size()  );
//            pw.println();
//            for (int s : indexMinus) {
//                pw.print(s + 1  + " ");
//            }
//        }
//
//        pw.close();
//
//    }
//
//}
