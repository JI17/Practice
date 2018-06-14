package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortedArr {

//    Заполним массив числами в промежутке [-1000, 1000]

    public void randomFillArr(Integer arr[]) {
        int a = -1000;
        int b = 1000;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (a + Math.random() * (b - a));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();


    }

    public void sortedArr(Integer arr[]) {

//        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0, j = (arr.length -1) / 2; i < arr.length / 2; i++, j--) {

            if (i < arr.length / 2) {
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[10];

        SortedArr sortedArr = new SortedArr();
        sortedArr.randomFillArr(arr);
        sortedArr.sortedArr(arr);
    }
}

