package ru.job4j.array;

public class ArrayDifinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Alexey Perunin";
        names[1] = "Vladimir Medvedev";
        names[2] = "Oleg Petrov";
        names[3] = "Petr Kovalev";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
