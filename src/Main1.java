public class Main1 {
    public static void method() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
    }

    public static void main(String[] args) {
        System.gc();
        method();

    }
}
