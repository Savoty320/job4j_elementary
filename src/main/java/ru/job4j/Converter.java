package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are 2 . Test result : " + passed);
        float in1 = 120;
        float expected1 = 2;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected == out;
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are 2 . Test result : " + passed1);
    }
}