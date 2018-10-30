package ru.acmp.one;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] argv) throws IOException {
        new Main().run();
    }

    public void run() throws IOException {
        Scanner  sc = new Scanner(new File("input.txt"));
        int a = sc.nextInt();
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        int sum = 0;
        if (a > 0) {
            sum = (1 + a) * a / 2;
        } else {
            sum = (1 + a) * (2 - a) / 2;
        }

        pw.print(sum);
        pw.close();
    }
}

