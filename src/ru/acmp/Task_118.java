package ru.acmp;

import java.util.Scanner;
//В нашем варианте мы начнем с того, что выстроим в круг N человек, пронумерованных числами от 1 до N,
// и будем исключать каждого k-ого до тех пор, пока не уцелеет только один человек.
//Например, если N=10, K=3, то сначала умрет 3-й, потом 6-й, затем 9-й, затем 2-й,
// затем 7-й, потом 1-й, потом 8-й, за ним - 5-й, и потом 10-й. Таким образом, уцелеет 4-й.
//Требуется написать программу, которая по заданным N и K будет определять номер уцелевшего человека.

public class Task_118 {

    static int positionFlavia(int n, int k) {
        int position = 0;
        for (int i = 0; i < n; ++i) {
            position = (position + k) % (i + 1);
        }
        return position + 1;
    }

    public static void main(String[] argv) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(positionFlavia(n, k));
    }
}


