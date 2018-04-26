package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    static List<String> mList = Arrays.asList("1aa1", "dd1", "1bb2", "aa3", "cc3");

    public static void main(String[] args) {
        mList.stream()
                .filter((s -> s.endsWith("3")))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        IntStream.range(1, 10)
                .forEach(System.out::println);//вывод значений 1-9 без цикла

        Stream.of("1aa1", "dd1", "1bb2", "aa3", "cc3")//создание потока без создания коллекции
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(2, 16)
                .mapToObj(i -> "c" + i)
                .forEach(System.out::println);

    }
}
