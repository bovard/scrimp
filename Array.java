package scrimp;

import battlecode.common.Direction;
import battlecode.common.MapLocation;
import battlecode.common.Robot;
import battlecode.common.RobotInfo;

public class Array {
    public Object[] arr = new Object[100000];
    public int length = 0;

    public Array() {

    }

    public void add(Object o) {
        arr[length] = o;
        length++;
    }

    public int getIntAtIndex(int index) {
        return (Integer)arr[index];
    }

    public MapLocation getMapLocationAtIndex(int index) {
        return (MapLocation)arr[index];
    }

    public Direction getDirectionAtIndex(int index) {
        return (Direction)arr[index];
    }

    public Robot getRobotAtIndex(int index) {
        return (Robot)arr[index];
    }

    public RobotInfo getRobotInfoAtIndex(int index) {
        return (RobotInfo)arr[index];
    }

    public double getDoubleAtIndex(int index) {
        return (Double)arr[index];
    }

    public boolean getBooleanAtIndex(int index) {
        return (Boolean)arr[index];
    }
}
