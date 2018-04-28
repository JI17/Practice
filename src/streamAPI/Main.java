package streamAPI;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(
                new Person("Andrew", 20),
                new Person("Igor", 23),
                new Person("Ira", 23),
                new Person("Vitia", 12));

//          Вовод имен, начинающихся на букву "I

        List<Person> filtered = person.stream()
                .filter(p -> p.name.startsWith("I"))
                .collect(Collectors.toList());

        System.out.println(filtered);

//        Группировка списка по возрасту

        Map<Integer, List<Person>> personsByAge = person
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

//        Узнать средни возраст

        Double averageAge = person
                .stream()
                .collect(Collectors.averagingInt(p -> p.age));

        System.out.println(averageAge);

//        Суммаризатор

        IntSummaryStatistics ageSummary = person
                .stream()
                .collect(Collectors.summarizingInt(p -> p.age));

        System.out.println(ageSummary);

//    Джойнер

        String phrase = person
                .stream()
                .filter(p -> p.age >= 18)
                .map(p -> p.name)
                .collect(Collectors.joining(", ", "В Германии ", " совершеннолетние"));
        System.out.println(phrase);

//        Преобразование в Map

        Map<Integer, String> map = person
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> name1 + ";" + name2));
        System.out.println(map);

//      Создание своего Collectors

        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "), //supplier--поставщик
                        (j, p) -> j.add(p.name.toUpperCase()),  //accumulator--аккамулятор
                        StringJoiner::merge,                    //combiner--объединитель
                        StringJoiner::toString);                //finisher--финишер

//    Проверяем собственный Collectors

        String names = person
                .stream()
                .collect(personNameCollector);
        System.out.println(names);


    }
}
