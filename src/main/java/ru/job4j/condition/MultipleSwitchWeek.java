package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int res = MultipleSwitchWeek.numberOfDay("Monday");
        System.out.println(res);
    }
}
