package codeWars.kyu7;

import codeWars.kyu8.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgeSolutionTest {
    @Test
    public void FixedTests() {
        assertEquals(86, AgeSolution.predictAge(65,60,75,55,60,63,64,45));
        assertEquals(79, AgeSolution.predictAge(32,54,76,65,34,63,64,45));
    }
}