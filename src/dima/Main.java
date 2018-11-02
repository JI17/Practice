package dima;

public class Main {

    public static void main(String[] args) {

        int[] arrNoPalindrome = {1, 2, 3, 4, 5};
        int[] arrPalindrome = {1, 2, 3, 2, 1};

        checkReverse(arrNoPalindrome);
        checkReverse(arrPalindrome);
    }

    private static void checkReverse(int[] arr) {

        String str = "";
        String strReverse = "";

        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            strReverse += arr[i];
        }

        if (str.equals(strReverse)) {
            System.out.println("Palindrome");
        } else System.out.println("No palindrome");
    }
}
