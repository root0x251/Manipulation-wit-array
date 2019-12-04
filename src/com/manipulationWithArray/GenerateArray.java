package com.manipulationWithArray;

import java.util.Random;

/**
 * Vyacheslav Alekseevich
 * 03/12/2019
 */

public class GenerateArray {

    public int[] generateRandomArray(int countElements) {
        Random random = new Random();
        int[] array = new int[countElements];
        for (int i = 0; i < countElements; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public int[] generateRandomArray(int countElements, int rangeMin, int rangeMax) {
        if (rangeMax < rangeMin) {
            return null;
        } else {
            Random random = new Random();
            int[] array = new int[countElements];
            for (int i = 0; i < countElements; i++) {
                array[i] = random.nextInt((rangeMax - rangeMin) + 1) + rangeMin;
            }
            return array;
        }
    }

    public int[] generateSortedArray(int countElements) {
        int[] array = new int[countElements];
        for (int i = 0; i < countElements; i++) {
            array[i] = i;
        }
        return array;
    }


}
