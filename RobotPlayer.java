package scrimp;

import battlecode.common.RobotController;
import scrimp.arrays.IntArray;
import scrimp.arrays.IterableArray;
import scrimp.bytecode.ByteCodeTest;
import scrimp.bytecode.ControlFlow.Functions;
import scrimp.bytecode.ControlFlow.IfElseVsSwitch;
import scrimp.bytecode.ControlFlow.Loops;
import scrimp.bytecode.DataTypes.Numerics;
import scrimp.bytecode.DataTypes.NumericsComparisons;

import java.util.ArrayList;


public class RobotPlayer {

	public static void run(RobotController rc) {
        boolean test = false;

        ByteCodeTest testing = new NumericsComparisons();
        testing.run();

        /*
        String a = "asdf";
        String b = "asdf";
        String c;
        Timer.StartTimer();
        c = a + b;
        Timer.EndTimer();

        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{ 1, 2, 3, 4};
        int[] array1and2 = new int[array1.length + array2.length];
        Timer.StartTimer();
        System.arraycopy(array1, 0, array1and2, 0, array1.length);
        System.arraycopy(array2, 0, array1and2, array1.length, array2.length);
        Timer.EndTimer();


        long l = 3L;
        Timer.StartTimer();
        System.out.println(Long.bitCount(l));
        Timer.EndTimer();

        /*

        /*
        System.out.println("Making an int");
        Timer.StartTimer();
        int testA = 1;
        Timer.EndTimer();
        System.out.println("Making an Integer with Integer");
        Timer.StartTimer();
        Integer testB = new Integer(1);
        Timer.EndTimer();
        System.out.println("Making an Integer with int");
        Timer.StartTimer();
        Integer testC = 1;
        Timer.EndTimer();
        System.out.println("Making an Object int ");
        Timer.StartTimer();
        Object testE = 1;
        Timer.EndTimer();
        System.out.println("Making an Object Integer ");
        Timer.StartTimer();
        Object testF = new Integer(0);
        Timer.EndTimer();
        */


        /*
        int num = 50;

        System.out.println("Good Way Array");
        Timer.StartTimer();
        int[] intA = new int[num];
        for (int i = 0; i < num; i++) {
            intA[i] = i;

        }
        for (int i = 0; i < num; i++) {
            System.out.println(intA[i]);
        }
        Timer.EndTimer();


        System.out.println("Iterable Array");
        Timer.StartTimer();
        IterableArray a = new IterableArray();
        for (int i = 0; i < num; i++) {
            a.add(i);
        }
        for (Object i: a) {
            System.out.println(i);
        }
        Timer.EndTimer();


        System.out.println("ArrayList");
        Timer.StartTimer();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            b.add(i);
        }
        for (int i: b) {
            System.out.println(i);
        }
        Timer.EndTimer();
        */


        if (test) {
            System.out.println("Running unit tests for IntArray");
            Timer.StartTimer();
            IntArray testIntArray = new IntArray();
            for (int i = 20; --i >= 0;) {
                testIntArray.add(i);
            }
            for (int i = 0; i < 20; i++) {
                assert testIntArray.arr[i] == i;
            }
            Timer.StartTimer();

        }

	}

}
