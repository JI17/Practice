import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    static List<String> mList = Arrays.asList("1aa1", "dd1", "1bb2", "aa3", "cc3");

    public static void main(String[] args) {
        mList.stream()
                .filter((s -> s.endsWith("3")))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
