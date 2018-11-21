package ru.acmp.one;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Main.run();
    }

    private static void run() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        String s1 = sc.next();


        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.print(s1);

        pw.close();
    }
}