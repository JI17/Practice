package work;

public class TestMain {

    public static void main(String[] args) {
        String[] ss = {"a", "B", "C", "D"};

        String s = String.join(" || ", ss[0], ss[1], ss[2], ss[3]);
        System.out.println(s);
        s.toUpperCase();
    }
}
