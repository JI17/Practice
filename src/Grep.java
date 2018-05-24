import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Необходимо реализовать консольную программу, которая бы фильтровала поток текстовой информации подаваемой на вход и
// на выходе показывала лишь те строчки, которые содержат слово передаваемое программе на вход в качестве аргумента.
//
//Программа не должна учитывать регистр


public class Grep {

    Scanner reader = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    public void filterString(String s) {

        for (int i = 0; i < 3; i++) {
            String string = reader.nextLine();

            if (string.contains(s)||string.equalsIgnoreCase(s)) {
                list.add(string);
            }
        }
        for (String res : list) {
            System.out.println(res);
        }
    }

    public static void main(String[] args) {

        Grep grep = new Grep();
        grep.filterString("vvv");

    }
}
