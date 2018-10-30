package ru.acmp;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int p = 0;

    public static void main(String[] args) throws IOException {
        Main.run();
    }

    private static void run() throws IOException {

       Scanner sc = new Scanner(new File("input.txt"));
        sc.useDelimiter(System.getProperty("line.separator"));
        String[] countOfNumbs = sc.next().split(" ");

        int n = Integer.parseInt(countOfNumbs[1]);
        String[] readNumbs = sc.next().split(" ");
        int iel = Integer.parseInt(readNumbs[0]);
        int jel = Integer.parseInt(readNumbs[1]);
        p = sc.nextInt();
        ArrayList<int[][]> arrays = new ArrayList<>();

        while (sc.hasNext()) {
            int[][] array = new int[n][n];
            sc.next();
            for (int j = 0; j < n; j++) {
                String[] split = sc.next().split(" ");
                for (int m = 0; m < split.length; m++) {
                    array[j][m] = Integer.parseInt(split[m]);
                }
            }
            arrays.add(array);
        }

        for (int i = 0; i < arrays.size() - 1; i++) {
            arrays.set(0, multiple(n, arrays.get(0), arrays.get(i + 1)));
        }

        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.print(arrays.get(0)[iel - 1][jel - 1]);
        pw.close();
    }

    private static int[][] multiple(int n, int[][] f, int[][] s) {
        int[][] multipleArray = new int[n][n];
        int[][] bt = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                bt[i][j] = s[j][i];

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                int value = 0;
                for (int k = 0; k < n; ++k)
                    value += f[i][k] * bt[j][k];
                if (value >= p) {
                    value = value % p;
                }
                multipleArray[i][j] = value;
            }
        return multipleArray;
    }
}
