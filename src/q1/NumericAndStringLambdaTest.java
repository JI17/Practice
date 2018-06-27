package q1;

interface NumericAndStringLambdaTest {
    boolean computeTest(int n);

    interface StringTest {
        boolean computeTest(String s);
    }


    static void main(String args[]) {
        NumericAndStringLambdaTest isEven = (n) -> (n % 2) == 0;
        NumericAndStringLambdaTest isNegative = (n) -> (n < 0);

        System.out.println(isEven.computeTest(5));

        System.out.println(isNegative.computeTest(-5));

        System.out.println();
        System.out.println();
        System.out.println();
        //
        StringTest isStringEquals = (s -> s.equals("SS"));
        System.out.println(isStringEquals.computeTest("SS"));

    }
}