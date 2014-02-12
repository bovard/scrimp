package scrimp.bytecode.DataTypes;

import scrimp.Timer;
import scrimp.bytecode.ByteCodeTest;

public class Numerics implements ByteCodeTest {
    @Override
    public void run() {

        //addTest((int) 10, (short) 10, (long) 10, (byte) 10, 23432.23f, 23432.23d);
        //timesTest((int) 10, (short) 10, (long) 10, (byte) 10, 23432.23f, 23432.23d);
        System.out.println("Comparing against zero");
        comparisonTest((int) 0, (short) 0, (long) 0, (byte) 0, 0f, 0d);
        System.out.println("Comparing against less than");
        comparisonTest((int) 9, (short) 9, (long) 9, (byte) 9, 9.23f, 9.23d);
        System.out.println("Comparing against equal");
        comparisonTest((int) 10, (short) 10, (long) 10, (byte) 10, 10.002341423f, 10.002341423d);
        System.out.println("Comparing against greater than");
        comparisonTest((int) 11, (short) 11, (long) 11, (byte) 11, 23432.23f, 23432.23d);
        //bitShiftTest();
    }

    public static void bitShiftTest() {
        int intInit = 10;
        System.out.println("Bit Shifting...");
        System.out.println("ints");
        Timer.StartTimer();
        intInit = intInit >> 2;
        Timer.EndTimer();

        long longInit = 10;
        System.out.println("longs");
        Timer.StartTimer();
        longInit = longInit >> 2;
        Timer.EndTimer();

    }



    public static void comparisonTest(int intToAdd, short shortToAdd, long longToAdd, byte byteToAdd, float floatToAdd, double doubleToAdd) {
        int intInit = 10;
        System.out.println("Printing");
        Timer.StartTimer();
        System.out.println(" ");
        Timer.EndTimer();
        System.out.println("Comparing...");
        System.out.println("ints");
        Timer.StartTimer();
        System.out.println(intInit == intToAdd);
        Timer.EndTimer();

        short shortInit = 10;
        System.out.println("shorts");
        Timer.StartTimer();
        System.out.println(shortInit == shortToAdd);
        Timer.EndTimer();

        long longInit = 10;
        System.out.println("longs");
        Timer.StartTimer();
        System.out.println(longInit == longToAdd);
        Timer.EndTimer();

        byte byteInit = 10;
        System.out.println("byte");
        Timer.StartTimer();
        System.out.println(byteInit == byteToAdd);
        Timer.EndTimer();

        float floatInit = 10.002341423f;
        System.out.println("floats");
        Timer.StartTimer();
        System.out.println(floatInit == floatToAdd);
        Timer.EndTimer();

        double doubleInit = 10.002341423d;
        System.out.println("doubles");
        Timer.StartTimer();
        System.out.println(doubleInit == doubleToAdd);
        Timer.EndTimer();
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
