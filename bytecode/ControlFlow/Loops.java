package scrimp.bytecode.ControlFlow;

import scrimp.Timer;
import scrimp.bytecode.ByteCodeTest;

public class Loops implements ByteCodeTest{
    private int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    public void run() {
        System.out.println("iteratorFor");
        Timer.StartTimer();
        iteratorFor();
        Timer.EndTimer();

        System.out.println("genericFor");
        Timer.StartTimer();
        genericFor();
        Timer.EndTimer();

        System.out.println("optimizedFor");
        Timer.StartTimer();
        optimizedFor();
        Timer.EndTimer();

        System.out.println("basicWhile");
        Timer.StartTimer();
        basicWhile();
        Timer.EndTimer();

        System.out.println("optimizedWhile");
        Timer.StartTimer();
        optimizedWhile();
        Timer.EndTimer();

        System.out.println("basicDoWhile");
        Timer.StartTimer();
        basicDoWhile();
        Timer.EndTimer();

        System.out.println("optimizedDoWhile");
        Timer.StartTimer();
        optimizedDoWhile();
        Timer.EndTimer();

        System.out.println("recursive");
        Timer.StartTimer();
        recursive(arr.length - 1);
        Timer.EndTimer();

        System.out.println("staticRecursive");
        Timer.StartTimer();
        staticRecursive(arr, arr.length - 1);
        Timer.EndTimer();

    }

    public int iteratorFor() {
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        return sum;
    }

    public int genericFor() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int optimizedFor() {
        int sum = 0;
        for (int i = arr.length; --i >= 0;) {
            sum += arr[i];
        }
        return sum;
    }

    public int optimizedWhile() {
        int sum = 0;
        int i = arr.length;
        while (--i>=0) {
            sum += arr[i];
        }
        return sum;
    }

    public int basicWhile() {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public int basicDoWhile() {
        int sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        return sum;
    }

    public int optimizedDoWhile() {
        int sum = 0;
        int i = arr.length - 1;
        do {
            sum += arr[i];
        } while (--i>=0);
        return sum;
    }

    public int recursive(int i) {
        if (i == 0) {
            return arr[i];
        }
        return arr[i] + recursive(--i);
    }

    public static int staticRecursive(int[] arr, int i) {
        if (i == 0) {
            return arr[i];
        }
        return arr[i] + staticRecursive(arr, --i);
    }
}
