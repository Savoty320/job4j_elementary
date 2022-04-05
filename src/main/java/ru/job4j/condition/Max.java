package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left + right;
        int label = result > 5 ? left : right;
        return label;
    }

    public static void main(String[] args) {
    int lr = Max.max(7, 5);
    System.out.println(lr);
    }
}
