package codeWars.testCodeWars;

import codeWars.kyu7.SumofNumbers3;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumofNumbers3Test {
    SumofNumbers3 s = new SumofNumbers3();

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