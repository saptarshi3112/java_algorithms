package main.heap;

import java.util.ArrayList;

public class Heap {

    private final ArrayList<Integer> list;

    public Heap () {
        this.list = new ArrayList<>();
    }

    private int getLeft (int i) {
        return 2*i+1;
    }

    private int getRight(int i) {
        return 2*i+2;
    }

    private void heapify(int index) {

        int size = this.getSize();

        int left = this.getLeft(index);
        int right = this.getRight(index);
        int largest = index;

        if (left <= size && this.list.get(left) >= this.list.get(largest)) {
            largest = left;
        }

        if (right <= size && this.list.get(right) >= this.list.get(largest)) {
            largest = right;
        }

        if (largest != index) {

            // get this item.
            int temp = this.list.get(largest);
            int temp2 = this.list.get(index);

            this.list.set(largest, temp2);
            this.list.set(index, temp);

            heapify(largest);
        }

    }

    public int getSize () {
        return this.list.size();
    }

    public void add (int value) {
        this.list.add(value);
        this.heapify(0);
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        for (int item : list)
            result.append(item).append(" ");

        result.append("\n");

        return result.toString();
    }

}
