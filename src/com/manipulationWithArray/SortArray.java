package com.manipulationWithArray;

/**
 * Vyacheslav Alekseevich
 * 04/12/2019
 */

public class SortArray extends GenerateArray {

    // сортировка пузырьком
    public int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int tempValue;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    // сортировка вставкой
    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

    // сортировка выбором
    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }

}
