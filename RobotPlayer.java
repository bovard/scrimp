package scrimp;

import battlecode.common.RobotController;
import scrimp.arrays.IntArray;

public class RobotPlayer {

	public static void run(RobotController rc) {
        boolean test = true;

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
        IntArray b = new IntArray();
        b.add(1);
        b.add(1);


        int sum = 0;
        System.out.println(b.length);
        Timer.StartTimer();
        for (int i = 0; i < b.length; i++) {
            sum += b.arr[i];
        }
        Timer.EndTimer();
        Timer.StartTimer();
        for (int i = b.length; --i >= 0;) {
            sum += b.arr[i];
        }
        Timer.EndTimer();
	}
}
