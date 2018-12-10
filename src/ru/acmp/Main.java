package ru.acmp;

import java.util.*;
import java.io.*;

public class Main {

    static void sum(Scanner scanner, PrintWriter printWriter) {
        int a = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        printWriter.print(sum);
    }

    public static void main(String[] argv) throws IOException {

        try (PrintWriter pw = new PrintWriter(System.out);
             Scanner sc = new Scanner(System.in)) {
                sum(sc, pw);
        }
    }
}
