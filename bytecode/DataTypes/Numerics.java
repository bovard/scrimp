package scrimp.bytecode.DataTypes;

import scrimp.Timer;
import scrimp.bytecode.ByteCodeTest;

public class Numerics implements ByteCodeTest {
    @Override
    public void run() {

        timesTest((int)10, (short)10, (long)10, (byte)10, 23432.23f, 23432.23d);
    }


    public static void timesTest(int intToAdd, short shortToAdd, long longToAdd, byte byteToAdd, float floatToAdd, double doubleToAdd) {
        int intInit = 10;
        System.out.println("Multiplying...");
        System.out.println("ints");
        Timer.StartTimer();
        intInit *= intToAdd;
        Timer.EndTimer();

        short shortInit = 10;
        System.out.println("shorts");
        Timer.StartTimer();
        shortInit *= shortToAdd;
        Timer.EndTimer();

        long longInit = 10;
        System.out.println("longs");
        Timer.StartTimer();
        longInit *= longToAdd;
        Timer.EndTimer();

        byte byteInit = 10;
        System.out.println("byte");
        Timer.StartTimer();
        byteInit *= byteToAdd;
        Timer.EndTimer();

        float floatInit = 10.002341423f;
        System.out.println("floats");
        Timer.StartTimer();
        floatInit *= floatToAdd;
        Timer.EndTimer();

        double doubleInit = 10.002341423d;
        System.out.println("doubles");
        Timer.StartTimer();
        doubleInit *= doubleToAdd;
        Timer.EndTimer();
    }

    public static void addTest(int intToAdd, short shortToAdd, long longToAdd, byte byteToAdd, float floatToAdd, double doubleToAdd) {
        int intInit = 10;
        System.out.println("Adding...");
        System.out.println("ints");
        Timer.StartTimer();
        intInit += intToAdd;
        Timer.EndTimer();

        short shortInit = 10;
        System.out.println("shorts");
        Timer.StartTimer();
        shortInit += shortToAdd;
        Timer.EndTimer();

        long longInit = 10;
        System.out.println("longs");
        Timer.StartTimer();
        longInit += longToAdd;
        Timer.EndTimer();

        byte byteInit = 10;
        System.out.println("byte");
        Timer.StartTimer();
        byteInit += byteToAdd;
        Timer.EndTimer();

        float floatInit = 10.002341423f;
        System.out.println("floats");
        Timer.StartTimer();
        floatInit += floatToAdd;
        Timer.EndTimer();

        double doubleInit = 10.002341423d;
        System.out.println("doubles");
        Timer.StartTimer();
        doubleInit += doubleToAdd;
        Timer.EndTimer();
    }

    public static void initTest() {
        System.out.println("Initializing int");
        Timer.StartTimer();
        int intInit = 10;
        Timer.EndTimer();

        System.out.println("Initializing short");
        Timer.StartTimer();
        short shortInit = 10;
        Timer.EndTimer();

        System.out.println("Initializing long");
        Timer.StartTimer();
        long longInit = 10;
        Timer.EndTimer();

        System.out.println("Initializing byte");
        Timer.StartTimer();
        byte byteInit = 10;
        Timer.EndTimer();

        System.out.println("Initializing float");
        Timer.StartTimer();
        float floatInit = 10.002341423f;
        Timer.EndTimer();

        System.out.println("Initializing double");
        Timer.StartTimer();
        double doubleInit = 10.002341423d;
        Timer.EndTimer();
    }
}
