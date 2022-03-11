package ru.job4j;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int results1 = MathFunc.func1(3);
        int results2 = MathFunc.func2(5);
        int results3 = MathFunc.func1(100);
        int total = results1 + results2;
        System.out.println(total);
        System.out.println(results3);
    }
}
