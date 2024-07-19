package ru.job4j.ru.job4j.calculator;

public class RTE {
    public static void main(String[] args) {
        int number = 100000;
        int mo = 0;
        while (mo < 3) {
            int dolg = number / 10;
            mo++;
            System.out.println(dolg);
        }
    }
}
