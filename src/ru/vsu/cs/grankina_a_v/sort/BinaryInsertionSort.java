package ru.vsu.cs.grankina_a_v.sort;

import java.util.Arrays;

public class BinaryInsertionSort {
    private int iteration;

    public int getIteration() {
        return iteration;
    }

    private int binarySearch(int[] array, int firstIndex, int lastIndex, long key) {
        int left = firstIndex;
        int right = lastIndex - 1;

        while (left <= right) {
            int middle = (left + right) >>> 1;
            long middleValue = array[middle];
            iteration++;
            if (middleValue < key)
                left = middle + 1;
            else if (middleValue > key)
                right = middle - 1;
            else
                return middle; // key found
        }
        return -(left + 1);  // key not found.
    }

    public void insertionSortForBinary(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int binary = Math.abs(Arrays.binarySearch(array, 0, i, current) + 1);
            for (int j = i - 1; j >= binary; j--) {
                array[j + 1] = array[j];
            }
            array[binary] = current;
            iteration++;
        }
    }

    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = Math.abs(binarySearch(array, 0, i, x) + 1);
            System.arraycopy(array, j, array, j + 1, i - j);

            array[j] = x;
        }
    }
}
