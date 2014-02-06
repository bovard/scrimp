
package scrimp.arrays;

/**
 * This class is a basic set for positive numbers
 *
 * To get more peformance, don't use the add method and increment the length as you go
 * (or just initialize all your arrays like this!)
 *
 * A loop through this (order doesn't matter)
 * IntSet a;
 * for (int i = a.length; --i >= 0; ) {
 *     // do things with a.arr[i];
 * }
 *
 * A loop through this going from 0 to length
 * (this is 2 * a.length bytcodes less efficient than above)
 * IntSet a;
 * for (int i = 0; i < a.length; i++) {
 *     // do things with a.arr[i]
 * }
 *
 */
public class IntSet {
    public int[] arr;
    public boolean[] contains;
    public int length = 0;

    public IntArray() {
        arr = new int[100000];
        contains = new boolean[100000];
    }

    public IntArray(int maxInt) {
        arr = new int[100000];
        contains = new boolean[maxInt + 1];
    }

    public void add(int toAdd) {
        if (!contains[toAdd]) {
            arr[length] = toAdd;
            length++;
        }
    }
}

