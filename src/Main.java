public class Main {

    String variable;
    public static void main(String[] args) {

        int[] a = {4, 2, 7, 1, 5};
        System.out.println(max(a));


}

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
