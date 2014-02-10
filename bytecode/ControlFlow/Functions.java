package scrimp.bytecode.ControlFlow;

import scrimp.Timer;
import scrimp.bytecode.ByteCodeTest;

class TestObj {
    public static final void funI() {

    }
}

public class Functions implements ByteCodeTest {
    @Override
    public void run() {
        System.out.println("Running funA");
        Timer.StartTimer();
        funA();
        Timer.EndTimer();

        System.out.println("Running funB");
        Timer.StartTimer();
        funB();
        Timer.EndTimer();

        System.out.println("Running funC");
        Timer.StartTimer();
        funC();
        Timer.EndTimer();

        System.out.println("Running funD");
        Timer.StartTimer();
        funD();
        Timer.EndTimer();

        System.out.println("Running funE");
        Timer.StartTimer();
        funE();
        Timer.EndTimer();

        System.out.println("Running funF");
        Timer.StartTimer();
        funF();
        Timer.EndTimer();

        System.out.println("Running funG");
        Timer.StartTimer();
        funG();
        Timer.EndTimer();

        System.out.println("Running funH");
        Timer.StartTimer();
        funH(10);
        Timer.EndTimer();

        TestObj test = new TestObj();
        System.out.println("Running funI");
        Timer.StartTimer();
        test.funI();
        Timer.EndTimer();



    }

    public void funA() {

    }

    private void funB() {

    }

    void funC() {

    }

    private static void funD() {

    }

    private final void funE() {

    }

    private static final void funF() {

    }

    private int funG() {
        return 10;
    }

    private int funH(int a) {
        return a;
    }
}
