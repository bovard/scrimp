package scrimp.arrays;

import java.util.Iterator;

public final class IterableArray implements Iterable {
    private int[] arr = new int[1000];
    private int length = 0;

    public final void add(int i) {
        arr[length] = i;
        length++;
    }

    @Override
    public final Iterator iterator() {
        return new Iterator() {
            int i = 0;

            @Override
            public final boolean hasNext() {
                return i < length;
            }

            @Override
            public final Object next() {
                return arr[i++];
            }

            @Override
            public final void remove() {
                throw new Error("Not Implemented!");
            }
        };
    }

}
