package codeWars.testCodeWars;

import codeWars.kyu7.SumOfNumbers3;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumbers3Test {
    SumOfNumbers3 s = new SumOfNumbers3();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(1, s.GetSum(1, 0));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(1, s.GetSum(1, 1));

        assertEquals(3, s.GetSum(1, 2));
        assertEquals(-1, s.GetSum(-1, 0));
        assertEquals(2, s.GetSum(-1, 2));

    }

}