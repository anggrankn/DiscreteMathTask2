package ru.vsu.cs.grankina_a_v;

import ru.vsu.cs.grankina_a_v.sort.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
        BinaryInsertionSort bis = new BinaryInsertionSort();

        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array = {5, 4, 3, 2, 1};
        //int[] array = {5, 0, 4, 7, 3, 6, 2, 9, 1};

        int[] arrayNew = array.clone();

        System.out.println(Arrays.toString(arrayNew));
        insertionSort.insertionSort(arrayNew);
        binaryInsertionSort.insertionSortForBinary(arrayNew);
        bis.sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(arrayNew));

        System.out.println("Число сравнений при линейной сортировке: " + insertionSort.getIteration());
        System.out.println("Число сравнений при бинарной сортировке: " + bis.getIteration());
    }
}
