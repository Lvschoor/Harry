package be.intecbrussel.harry;

import java.util.Arrays;

public class IntArrayTools {
    //created a private empty constructor to override the default public one
    private IntArrayTools() {

    }

    // testing if the array is sorted up or down depending on value of sortUp
    public static boolean isSorted(int[] arrayOfInts, boolean sortUp) {
        boolean sorted = false;

        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = i + 1; j < arrayOfInts.length; j++) {
                if (((arrayOfInts[i] <= arrayOfInts[j]) && sortUp) || ((arrayOfInts[i] >= arrayOfInts[j]) && !sortUp)) {
                    sorted = true;
                } else {
                    sorted = false;
                    break;
                }
            }
            if (!sorted) break;
        }
        return sorted;
    }

    // sorting the array (up or down) using the selection sort algorithm
    public static int[] sort(int[] arrayOfInts, boolean sortUp) {

        int temp;
        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = i; j < arrayOfInts.length - 1; j++) {
                int index = i;

                if (sortUp) {

                    if (arrayOfInts[j + 1] < arrayOfInts[index]) {
                        index = j + 1;
                    }
                } else {
                    if (arrayOfInts[j + 1] > arrayOfInts[index]) {
                        index = j + 1;
                    }
                }
                temp = arrayOfInts[i];
                arrayOfInts[i] = arrayOfInts[index];
                arrayOfInts[index] = temp;
            }
        }
        return arrayOfInts;
    }

    // sorting the array (up or down) using the bubble sort algorithm
    public static int[] sortBubble(int[] arrayOfInts, boolean sortUp) {
        int[] arrayOfIntsTest;
        boolean sorted = false;

        while (!sorted) {
            arrayOfIntsTest = arrayOfInts.clone();

            for (int i = 0; i < arrayOfInts.length - 1; i++) {
                if (sortUp) {
                    if (arrayOfInts[i] > arrayOfInts[i + 1]) {
                        int temp = arrayOfInts[i];
                        arrayOfInts[i] = arrayOfInts[i + 1];
                        arrayOfInts[i + 1] = temp;
                    }
                } else {
                    if (arrayOfInts[i] < arrayOfInts[i + 1]) {
                        int temp = arrayOfInts[i];
                        arrayOfInts[i] = arrayOfInts[i + 1];
                        arrayOfInts[i + 1] = temp;
                    }
                }
            }
            if (Arrays.equals(arrayOfInts, arrayOfIntsTest)) {
                sorted = true;
            }
        }

        return arrayOfInts;
    }

    //search if number is element of array
    public static boolean chopSearch(int[] arrayOfInts, int number) {
        boolean numberIsInArray = false;
        sort(arrayOfInts, true);
        int low = 0;
        int high = arrayOfInts.length - 1;
        int middle;
        while (low < high) {
            middle = (low + high) / 2;
            if (number == arrayOfInts[middle]) {
                numberIsInArray = true;
                break;
            } else if (number < arrayOfInts[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return numberIsInArray;
    }
}