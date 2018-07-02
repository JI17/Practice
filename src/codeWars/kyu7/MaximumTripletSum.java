package codeWars.kyu7;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumTripletSum {
    public static int maxTriSum(int[] numbers) {

        Set<Integer> mySet = new HashSet<Integer>();
        Arrays.stream(numbers).boxed().collect(Collectors.toSet());



        Set set = new HashSet();
        int numb[] = new int[numbers.length];
        int count = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {


        }
        return count; // Do your magic!
    }
}

