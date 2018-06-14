public class Triangle {
//    Даны вещественные числа a, b, и c. Найти площадь треугольника
//    со сторонами a, b, и c

    public static void areaOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);
    }

    public static void main(String[] args) {
        Triangle.areaOfTriangle(10, 13, 15);
    }
}
