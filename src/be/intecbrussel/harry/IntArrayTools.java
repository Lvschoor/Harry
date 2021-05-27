package be.intecbrussel.harry;

public class IntArrayTools {

    public static boolean isSorted(int[] arrayOfInts, boolean sortUp) {
        boolean sorted = false;

        if (sortUp) {
            for (int i = 0; i < arrayOfInts.length; i++) {
                for (int j = i + 1; j < arrayOfInts.length; j++) {
                    if (arrayOfInts[i] <= arrayOfInts[j]) {
                        sorted = true;
                    } else {
                        sorted = false;
                        break;
                    }
                }
                if (sorted==false) break;
            }
            return sorted;
        } else {
            for (int i = 0; i < arrayOfInts.length; i++) {
                for (int j = i + 1; j < arrayOfInts.length; j++) {
                    if (arrayOfInts[i] >= arrayOfInts[j]) {
                        sorted = true;
                    } else {
                        sorted = false;
                        break;
                    }
                }
                if (sorted==false) break;
            }
            return sorted;
        }

    }
}
