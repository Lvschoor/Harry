package be.intecbrussel.harry;

public class IntArrayTools {
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
}

