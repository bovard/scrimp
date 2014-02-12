package scrimp;

import battlecode.common.Clock;
import battlecode.common.GameConstants;

public class Timer {
	public static final void StartTimer() {
		time = -Clock.getBytecodeNum();
		round = -Clock.getRoundNum();
	}

	public static final int EndTimer() {
		round += Clock.getRoundNum();
        int clockByteCode = Clock.getBytecodeNum();

        int byteCode;
		if (round == 0) {
			byteCode =  time + clockByteCode - TIMER_COSTS;
		} else {
			byteCode = time + (round * 10000) + clockByteCode - TIMER_COSTS;
		}
        System.out.println("ByteCodes: " + byteCode);
        return byteCode;
	}

    public static final int EndTimer(int toSubtract) {
		round += Clock.getRoundNum();
        int clockByteCode = Clock.getBytecodeNum();

        int byteCode;
		if (round == 0) {
			byteCode =  time + clockByteCode - TIMER_COSTS - toSubtract - 1;
		} else {
			byteCode = time + (round * 10000) + clockByteCode - TIMER_COSTS - toSubtract - 1;
		}
        System.out.println("ByteCodes: " + byteCode);
        return byteCode;
	}

    public static final int GetRounds(int calcs) {
        return (GameConstants.BYTECODE_LIMIT - (Clock.getBytecodeNum() + 50)) / calcs;
    }

    public static final int GetRounds(int calcs, int sub) {
        return (GameConstants.BYTECODE_LIMIT - (Clock.getBytecodeNum() + sub)) / calcs;
    }

	private static int time;
	private static int round;
	private static final int TIMER_COSTS = 12;
}