package ru.acmp.one;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main.run();
    }

    private static void run() throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        int[] numbs = readNumbs(sc);
        int numbsTemp[] = numbs;
        int comp = 1;
        int sum = 0;
        int min = 0;
        int max = 0;


        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] > 0) {
                sum += numbs[i];
            }
        }
        Arrays.sort(numbsTemp);

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] == numbsTemp[0]) {
                min = i;
            }
            if (numbs[i] == numbsTemp[numbsTemp.length - 1]) {
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(numbs[min]);
//        System.out.println(numbs[min-1]);

//        for (int i = numbs[min+1]; i <= numbs[max-1]; i++) {
//
//            comp *= numbs[i];
//        }

        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.print(sum + " " + comp);

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