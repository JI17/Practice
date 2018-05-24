interface NumericTest {
    boolean computeTest(int n);

    interface StringTest {
        boolean computeTest(String s);
    }


    static void main(String args[]) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        NumericTest isNegative = (n) -> (n < 0);

        // Output: false
        System.out.println(isEven.computeTest(5));

        // Output: true
        System.out.println(isNegative.computeTest(-5));

        System.out.println();
        System.out.println();
        System.out.println();

        StringTest isStringEquals = (s -> s.equals("SS"));
        System.out.println(isStringEquals.computeTest("SS"));

    }
}