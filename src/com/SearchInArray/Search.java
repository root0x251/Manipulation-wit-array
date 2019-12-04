package com.SearchInArray;

/**
 * Vyacheslav Alekseevich
 * 03/12/2019
 */

public class Search {

    // перебор массива
    public void bruteForce(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                System.out.println("Found, id - " + array[i]);
                break;
            }
        }
    }

    // двоичный поиск
    public void binarySearchRecursively(int[] sortedArray, int number) {
        binarySearchRecursively(sortedArray, number, 0, sortedArray.length);
    }

    private int binarySearchRecursively(int[] sortedArray, int number, int startSearch, int endSearch) {
        int middle = (startSearch + endSearch) / 2;

        if (endSearch < startSearch) {
            System.out.println("No matches");
            return -1;
        }

        if (number == sortedArray[middle]) {
            System.out.println("Found, ID is " + middle);
            return middle;
        } else if (number < sortedArray[middle]) {
            return binarySearchRecursively(sortedArray, number, startSearch, middle - 1);
        } else { //  (key > sortedArray[middle])
            return binarySearchRecursively(sortedArray, number, middle + 1, endSearch);
        }
    }


}
