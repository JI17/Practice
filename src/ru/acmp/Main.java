package ru.acmp;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private short[][] matrix;

    private Main(short n) {
        this.matrix = new short[n][n];
    }

    public static void main(String[] args) throws IOException {
        Main.run();

    }

    private static void run() throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        short m = sc.nextShort();
        short n = sc.nextShort();
        short needI = sc.nextShort();
        short needJ = sc.nextShort();
        needI--;
        needJ--;
        short p = sc.nextShort();
        Main a = new Main(n);
        Main b = new Main(n);
        for (short i = 0; i < n; i++) {
            for (short j = 0; j < n; j++) {
                a.matrix[i][j] = sc.nextShort();
            }
        }
        for (short k = 1; k < m; k++) {
            for (short i = 0; i < n; i++) {
                for (short j = 0; j < n; j++) {
                    b.matrix[i][j] = sc.nextShort();
                }
            }
            a = a.multiple(b, n, p, needI, needJ);

        }
        pw.write(Short.toString(a.matrix[needI][needJ]));
        pw.close();
    }

    private Main multiple(Main b, short n, short x, short sI, short sJ) {
        Main c = new Main(n);
        for (short m = 0; m < n; m++) {
            for (short w = 0; w < n; w++) {
                c.matrix[sI][w] = (short) ((c.matrix[sI][w] + this.matrix[sI][m] * b.matrix[m][w]) % x);
//поменять указатели на обьекты в куче

            }
            for (short e = 0; e < n; e++) {
                c.matrix[sJ][e] = (short) ((c.matrix[sJ][e] + this.matrix[sJ][m] * b.matrix[m][e]) % x);
            }
        }
        return c;


        
    }
}