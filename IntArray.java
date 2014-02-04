package scrimp;

public class IntArray {
    public int[] arr;
    public int length = 0;

    public IntArray(int size) {
        arr = new int[size];
    }

    public void add(int toAdd) {
        arr[length] = toAdd;
        length++;
    }
}
