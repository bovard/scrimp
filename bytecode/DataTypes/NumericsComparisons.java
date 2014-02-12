package scrimp.bytecode.DataTypes;

import scrimp.Timer;
import scrimp.bytecode.ByteCodeTest;

public class NumericsComparisons implements ByteCodeTest {
    @Override
    public void run() {

        System.out.println("System.out.println statement takes:");
        Timer.StartTimer();
        System.out.println(" ");
        Timer.EndTimer();

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                equalityTests(i, j);
                greaterThanTests(i, j);
                lessThanTests(i, j);
                greaterThanOrEqualTests(i, j);
                lessThanOrEqualTests(i, j);
            }
        }

        System.out.println("Against constant zero");
        for (int i = -1; i <= 1; i++) {
            equalAgainstConstantZero(i);
            lessThanAgainstConstantZero(i);
            greaterThanAgainstConstantZero(i);
        }


        System.out.println("Against constant 10");
        for (int i = -1; i <= 1; i++) {
            equalAgainstConstantTen(i);
            lessThanAgainstConstantTen(i);
            greaterThanAgainstConstantTen(i);
        }

    }

    public static void equalityTests(int a, int b) {
        System.out.println("Comparing " + a + " == " + b);
        Timer.StartTimer();
        System.out.println(a == b);
        Timer.EndTimer(3);
    }

    public static void greaterThanTests(int a, int b) {
        System.out.println("Comparing " + a + " > " + b);
        Timer.StartTimer();
        System.out.println(a > b);
        Timer.EndTimer(3);
    }

    public static void lessThanTests(int a, int b) {
        System.out.println("Comparing " + a + " < " + b);
        Timer.StartTimer();
        System.out.println(a < b);
        Timer.EndTimer(3);
    }

    public static void greaterThanOrEqualTests(int a, int b) {
        System.out.println("Comparing " + a + " >= " + b);
        Timer.StartTimer();
        System.out.println(a >= b);
        Timer.EndTimer(3);
    }

    public static void lessThanOrEqualTests(int a, int b) {
        System.out.println("Comparing " + a + " <= " + b);
        Timer.StartTimer();
        System.out.println(a <= b);
        Timer.EndTimer(3);
    }

    public static void equalAgainstConstantZero(int a) {
        System.out.println("Comparing against constant zero " + a + " == 0");
        Timer.StartTimer();
        System.out.println(a == 0);
        Timer.EndTimer(3);
    }

    public static void lessThanAgainstConstantZero(int a) {
        System.out.println("Comparing against constant zero " + a + " < 0");
        Timer.StartTimer();
        System.out.println(a < 0);
        Timer.EndTimer(3);
    }


    public static void greaterThanAgainstConstantZero(int a) {
        System.out.println("Comparing against constant zero " + a + " > 0");
        Timer.StartTimer();
        System.out.println(a > 0);
        Timer.EndTimer(3);
    }


    public static void equalAgainstConstantTen(int a) {
        System.out.println("Comparing against constant zero " + a + " == 10");
        Timer.StartTimer();
        System.out.println(a == 10);
        Timer.EndTimer(3);
    }

    public static void lessThanAgainstConstantTen(int a) {
        System.out.println("Comparing against constant zero " + a + " < 10");
        Timer.StartTimer();
        System.out.println(a < 10);
        Timer.EndTimer(3);
    }


    public static void greaterThanAgainstConstantTen(int a) {
        System.out.println("Comparing against constant zero " + a + " > 10");
        Timer.StartTimer();
        System.out.println(a > 10);
        Timer.EndTimer(3);
    }
}
