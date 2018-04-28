package streamAPI;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private String name;

    public String getName() {
        return name;
    }

    List<Bar> bars = new ArrayList();

    public Foo(String name) {
        this.name = name;
    }

}
