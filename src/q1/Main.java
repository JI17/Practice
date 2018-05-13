package q1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public void setPersonList(List<Person> personList) {
        personList.add(new Person("Vasia", 23));
        personList.add(new Person("Vasia", 25));
        personList.add(new Person("Vasia", 2));
        personList.add(new Person("Vasia", 3));
        personList.add(new Person("Vasia", 123));
        personList.add(new Person("Vasia", 27));
    }


    public List<Person> getPersonList(List<Person> personList) {
        return personList;
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        new Main().setPersonList(personList);
        System.out.println(new Main().getPersonList(personList));
    }

}
