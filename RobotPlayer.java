package scrimp;

import battlecode.common.RobotController;

public class RobotPlayer {

	public static void run(RobotController rc) {

		while(true) {
            try {
                Object o = 1.0;
                double a = 10.1234;
                Timer.StartTimer();
                double c = a;
                Timer.EndTimer();
                System.out.println(a);

            } catch (Exception e) {
                e.printStackTrace();
            }
			rc.yield();
		}
	}
}
