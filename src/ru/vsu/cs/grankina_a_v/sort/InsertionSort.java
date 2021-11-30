package ru.vsu.cs.grankina_a_v.sort;

public class InsertionSort {
    private int iteration;

    public int getIteration() {
        return iteration;
    }

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0) {
                iteration++;
                if (current < array[j]) {
                    array[j + 1] = array[j];
                    j--;
                }
                else{
                    break;
                }
            }
            array[j + 1] = current;
        }
    }
}

