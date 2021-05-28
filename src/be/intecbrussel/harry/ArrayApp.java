package be.intecbrussel.harry;


import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
        int[] testArray = {1, 5, 3, 6};
        int number = 7;
        System.out.println("The given array of numbers: " + Arrays.toString(testArray));
        System.out.println("The array is sorted: " + IntArrayTools.isSorted(testArray, false));
        System.out.println("The sorted array: " + Arrays.toString(IntArrayTools.sort(testArray, true)));
        System.out.println("The reverse sorted array: " + Arrays.toString(IntArrayTools.sort(testArray, false)));
        System.out.println("The sorted array using bubble sort: " + Arrays.toString(IntArrayTools.sortBubble(testArray, true)));
        System.out.println("The number " + number + " is an element of the array: " + IntArrayTools.chopSearch(testArray, number));

        char[] testArrayChar = {'a','b','+','Z','1','z', 'A', '?', 'D', 'f'};
        System.out.println("The given array of chars: "+Arrays.toString(testArrayChar));
        System.out.println("The cleaned array: "+ Arrays.toString(CharArrayTools.filterAlphabet(testArrayChar)));
        System.out.println("Cleaned and alphabetically (capital letters first) ordered array: "+ Arrays.toString(CharArrayTools.filterAlphabet(CharArrayTools.sort(testArrayChar))));

        System.out.println("The dictionary:");
        int counter=1;
        for (char[] row: CharArrayTools.generateDictionary(3)){
            System.out.print("Woord "+counter+": ");
            counter++;
            for (char letter:row) {
                System.out.print(letter);
            }
            System.out.println();
        }

    }
}
