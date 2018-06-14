package collections;

//Написатть метод, который принимаем в качeстве параметров два List a и b.
//Данные коллекции можно представить в виде a = [a1, a2, a3, ....] и b = [b1, b2, b3, ...]. По результату выполеения программы
//надо получить в коллекции c следующее c = [a1, b1, a2, b2, a3, b3.....].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeCollections {

    static void addListAll(List<String> a, List<String> b) {

        String[] merge = new String[a.size() + b.size()];


        for (int i = 0, j = 0, k = 0; (i < a.size() && j < b.size()); i++, j++, k += 2) {
            merge[k] = a.get(i);
            merge[k + 1] = b.get(j);
        }

        System.out.println(Arrays.asList(merge));
    }

    public static void main(String[] args) {

        List<String> a = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a4", "a5"));
        List<String> b = new ArrayList<>(Arrays.asList("b1", "b2", "b3", "b4", "b5"));

        MergeCollections.addListAll(a, b);
    }
}
