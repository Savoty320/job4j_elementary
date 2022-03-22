package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv1(0);
        possibleDiv2(-4);
    }

    public static void possibleDiv1(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
    }

        public static void possibleDiv2(int number) {
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }
}
