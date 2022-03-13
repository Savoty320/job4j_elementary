package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return one;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(2, 3, 4, 5);
        System.out.println("result2 (2, 3) to (4, 5)" + result2);
        double result3 = Point.distance(20, 25, 34, 45);
        System.out.println("result3 (20, 25) to (34, 45)" + result3);
    }
}
