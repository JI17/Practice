package q1;//+Написать консольную программу, которая бы сортировала текст поданный ей на стандартный вход по алфавиту.
//
//Варианты усложнения:
//+Программа должна игнорировать регистр при сортировке
//Программа должна сортировать не по алфавиту, а по количеству символов в строке

import java.util.*;

public class AnalogSort {
    List<String> list = new ArrayList<>();

    public String sortByAlphabet(String []string) {

        for (int i = 0; i < string.length; i++) {

            list.add(string[i]);

            //Collections.sort() позволяет передавать пользовательский компаратор для упорядочения.
            // Для класса без учета регистра String класс предоставляет статический конечный компаратор, называемый CASE_INSENSITIVE_ORDER.
            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        }

        for (String res : list) {
            System.out.println(res);
        }
        return list.toString();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");

        AnalogSort analogSort = new AnalogSort();
        analogSort.sortByAlphabet(string);
    }
}

