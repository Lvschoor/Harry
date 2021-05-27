package be.intecbrussel.harry;


import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
	int[] testArray=  {1,5,3,6};
        System.out.println(IntArrayTools.isSorted(testArray, true));
        System.out.println(Arrays.toString(IntArrayTools.sort(testArray,true)));
        System.out.println(Arrays.toString(IntArrayTools.sort(testArray,false)));

    }
}
