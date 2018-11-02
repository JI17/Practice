package ru.acmp;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class Main {
//
//    private short[][] matrix;
//
//    private Main(short n) {
//        this.matrix = new short[n][n];
//    }
//
//    public static void main(String[] args) throws IOException {
//        Main.run();
//
//    }
//
//    private static void run() throws IOException {
//
//        Scanner sc = new Scanner(new File("input.txt"));
//        PrintWriter pw = new PrintWriter(new File("output.txt"));
//
//        short m = sc.nextShort();
//        short n = sc.nextShort();
//        short needI = sc.nextShort();
//        short needJ = sc.nextShort();
//        needI--;
//        needJ--;
//        short p = sc.nextShort();
//        Main a = new Main(n);
//        Main b = new Main(n);
//        for (short i = 0; i < n; i++) {
//            for (short j = 0; j < n; j++) {
//                a.matrix[i][j] = sc.nextShort();
//
//            }
//        }
//        for (short k = 1; k < m; k++) {
//            for (short i = 0; i < n; i++) {
//                for (short j = 0; j < n; j++) {
//                    b.matrix[i][j] = sc.nextShort();
//                }
//            }
//            a = a.multiple(b, n, p, needI, needJ);
//
//        }
//        pw.write(Short.toString(a.matrix[needI][needJ]));
//        pw.close();
//    }
//
//    private Main multiple(Main b, short n, short x, short sI, short sJ) {
//        Main c = new Main(n);
//        for (short m = 0; m < n; m++) {
//            for (short w = 0; w < n; w++) {
//                c.matrix[sI][w] = (short) ((c.matrix[sI][w] + this.matrix[sI][m] * b.matrix[m][w]) % x);
////поменять указатели на обьекты в куче
//
//            }
//            for (short e = 0; e < n; e++) {
//                c.matrix[sJ][e] = (short) ((c.matrix[sJ][e] + this.matrix[sJ][m] * b.matrix[m][e]) % x);
//            }
//        }
//
//        return c;
//
//
//
//    }
//}
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private int[] METAINF;
    private final int QUANTITY_ARRAYS;
    private final int SIZE_ARRAY;
    private final int ELEMENT_ROW;
    private final int ELEMENT_COLUMN;
    private final int NUM_P;
    private int [] elLine;

    private Main() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        METAINF = new int [4];
        for(int i = 0,k=0; i<2;i++){
            String [] tempMeta = sc.nextLine().split(" ");
            for (int j = 0; j<2;j++){
                METAINF [k++] = Integer.valueOf(tempMeta [j]);
            }
        }
        QUANTITY_ARRAYS = METAINF [0];
        SIZE_ARRAY = METAINF [1];
        ELEMENT_ROW = METAINF [2] - 1;
        ELEMENT_COLUMN = METAINF [3] - 1;
        NUM_P = Integer.valueOf(sc.nextLine());;
        createElLine(sc);
        sc.close();
    }

    private void createElLine(Scanner sc) {
        elLine = new int[SIZE_ARRAY];
        if(sc.hasNextLine()){
            sc.nextLine();
        }
        for (int i = 0; i < SIZE_ARRAY; i++) {
            if (i==ELEMENT_ROW) {
                String [] temp = sc.nextLine().split(" ");
                for (int j = 0; j < SIZE_ARRAY; j++) {
                    elLine[j] = Integer.valueOf(temp[j]);
                }
                continue;
            }
            if(sc.hasNextLine()){
                sc.nextLine();
            }
        }
        if(sc.hasNextLine()){
            sc.nextLine();
        }
        for (int n = 1; n < QUANTITY_ARRAYS; n++) {
            int [] sum = new int [SIZE_ARRAY];
            for (int i = 0; i < SIZE_ARRAY; i++) {
                String [] temp = sc.nextLine().split(" ");
                for (int j = 0; j < SIZE_ARRAY; j++) {
                    sum[j]+=Integer.valueOf(temp[j])*elLine[i];
                    if (i==SIZE_ARRAY-1 && sum[j]>=NUM_P) {
                        sum[j]%=NUM_P;
                    }
                }
            }
            elLine = sum;
            if(sc.hasNextLine()){
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Main obj = new Main();
        obj.printAnswer();

    }

    private void printAnswer() throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write(elLine[ELEMENT_COLUMN] + "");
        writer.close();
    }

}
