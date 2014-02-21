package scrimp.bytecode.DataTypes;

import scrimp.Timer;
import scrimp.bytecode.ByteCodeTest;

public class Strings implements ByteCodeTest {

    @Override
    public void run() {
        initTest();
        addTest();
    }

    private static void initTest() {
        System.out.println("Declaration");
        Timer.StartTimer();
        String a;
        Timer.EndTimer();

        System.out.println("Declaration and assignment = b");
        Timer.StartTimer();
        String b = "b";
        Timer.EndTimer();

        System.out.println("Declaration and assignment = a much longer assignmetn");
        Timer.StartTimer();
        String c = "a much longer assigment";
        Timer.EndTimer();

        System.out.println("assignment");
        Timer.StartTimer();
        a = "assignment";
        Timer.EndTimer();

    }

    private static void addTest() {

        String a = "asdf";
        String b = "asdf";
        String c;
        Timer.StartTimer();
        c = a + b;
        Timer.EndTimer();

        Timer.StartTimer();
        c = a.concat(b).concat(a);
        Timer.EndTimer();

    }
}
