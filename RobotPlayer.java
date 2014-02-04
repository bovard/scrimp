package scrimp;

import battlecode.common.RobotController;
import scrimp.arrays.IntArray;

public class RobotPlayer {

	public static void run(RobotController rc) {
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
