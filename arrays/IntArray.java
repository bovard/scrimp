package scrimp.arrays;

/**
 * This class is a basic growing array but is far more byte code
 * efficient than using an ArrayList of dynamically resizing an array as you go
 *
 * To get more peformance, don't use the add method and increment the length as you go
 * (or just initialize all your arrays like this!)
 *
 * A loop through this (order doesn't matter)
 * IntArray a;
 * for (int i = a.length; --i >= 0; ) {
 *     // do things with a.arr[i];
 * }
 *
 * A loop through this going from 0 to length
 * (this is 2 * a.length bytcodes less efficient than above)
 * IntArray a;
 * for (int i = 0; i < a.length; i++) {
 *     // do things with a.arr[i]
 * }
 *
 *
 *
 *
 */
public class IntArray {
    public int[] arr;
    public int length = 0;

    public IntArray() {
        arr = new int[100000];
    }

    public void add(int toAdd) {
        arr[length] = toAdd;
        length++;
    }
}
