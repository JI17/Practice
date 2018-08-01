package codeWars.kyu7;

public class SumOfNumbers3 {
    public int GetSum(int a, int b) {

        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
