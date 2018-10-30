package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ServiceList {
    public void addList(List list, String name) {
        long start = System.nanoTime();
        for (int i = 0; i < 4000; i++) {
            list.add(i);
        }
        long finish = System.nanoTime() - start;

        System.out.println("ADD " + name + " : " + finish);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ServiceList().addList(new ArrayList(), "ArrayList");
            new ServiceList().addList(new LinkedList(), "LinkedList");
            System.out.println("- - - - - - - - -");
        }
    }
}