package codeWars.kyu7;

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {

        int count = 0;
        double sum = 0;

        while (sum <= p) {
            sum += nbYear((int) sum, percent, aug, p) + p0 * percent + aug;
            count++;
        }
        return count;
    }
}
