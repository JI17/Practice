package collections.twoListInMap;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        User vitali = new User("Vitali", 29, true);
        User aliona = new User("Aliona", 25, false);

        Specialty specialtyVitali = new Specialty("Инженегр");
        Specialty specialtyAliona = new Specialty("Бизнес-юрист");

        Map<Specialty, User> userSpecialtyMap = new HashMap<>();
        userSpecialtyMap.put(specialtyVitali, vitali);
        userSpecialtyMap.put(specialtyAliona, aliona);

        userSpecialtyMap.forEach((specialty, user) -> System.out.println(userSpecialtyMap));
    }

}
