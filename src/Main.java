import com.SearchInArray.Search;
import com.manipulationWithArray.SortArray;

/**
 * Vyacheslav Alekseevich
 * 04/12/2019
 */

public class Main extends SortArray {
    public static void main(String[] args) {
        Main main = new Main();
        Search search = new Search();

        // create array with random numbers

        int[] array = main.generateRandomArray(500_000, 0, 500_000);

        System.out.println("bruteForce");
        // brute force
        long startTime = System.nanoTime();
        search.bruteForce(array, 666);
        System.out.println("Search result " + (System.nanoTime() - startTime) / 1_000_000 + " ms");


        // sort array
        startTime = System.nanoTime();
        main.insertionSort(array);
        System.out.println("InsertionSort, Array was sorted in " + (System.nanoTime() - startTime) / 1_000_000 + " ms");

        // binary search
        startTime = System.nanoTime();
        search.binarySearchRecursively(array, 666);
        System.out.println("Search result " + (System.nanoTime() - startTime) / 1_000_000 + " ms");





    }





}
