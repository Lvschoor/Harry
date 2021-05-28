package be.intecbrussel.harry;

public class CharArrayTools {

    private static int x = 0;

    //created a private empty constructor to override the default public one
    private CharArrayTools() {

    }

    public static char[] filterAlphabet(char[] arrayOfChars) {

        int teller1 = 0;
        int teller2 = 0;
        for (char c : arrayOfChars) {
            if (c < 65 || (c > 90 && c < 97) || c > 122) {
                teller1++;
            }
        }
        char[] arrayOfLetters = new char[arrayOfChars.length - teller1];
        for (char c : arrayOfChars) {
            if (!(c < 65 || (c > 90 && c < 97) || c > 122)) {
                arrayOfLetters[teller2] = c;
                teller2++;
            }
        }
        return arrayOfLetters;
    }

    public static char[] sort(char[] arrayOfChars) {

        char temp;
        for (int i = 0; i < arrayOfChars.length; i++) {
            for (int j = i; j < arrayOfChars.length - 1; j++) {
                int index = i;

                if (arrayOfChars[j + 1] < arrayOfChars[index]) {
                    index = j + 1;
                }


                temp = arrayOfChars[i];
                arrayOfChars[i] = arrayOfChars[index];
                arrayOfChars[index] = temp;
            }
        }
        return arrayOfChars;

    }

    // create all possible words (letter combinations);
    // for now only the case with 3 letter per word is considered
    public static char[][] generateDictionary(int numberOfLetters) {
        int combinations = (int) Math.pow(26, numberOfLetters);
        //int x = 0;
        char[][] dictionary = new char[combinations][numberOfLetters];

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    dictionary[x][2] = (char) (97 + k);
                    dictionary[x][1] = (char) (97 + j);
                    dictionary[x][0] = (char) (97 + i);
                    x++;
                }
            }
        }
        return dictionary;
    }

    // attempt to make the dictionary flexible for different lengths of the words
    public static char[][] generateDictionaryBis(int numberOfLetters) {
        //create array with correct size
        int combinations = (int) Math.pow(26, numberOfLetters);
        char[][] dictionary = new char[combinations][numberOfLetters];
        //call method fillDictionary to fill the array using recursive method
        dictionary = fillDictionary(dictionary, numberOfLetters);
        return dictionary;
    }

    // method using recursion to fill the array with letters
    public static char[][] fillDictionary(char[][] dictionary, int numberOfLetters) {

        if (x==dictionary.length||numberOfLetters== 0){}



        /*while (numberOfLetters > 0) {
            for (int k = 0; k < 26; k++) {
                for (int counter = numberOfLetters - 1; counter >= 0; counter--) {
                    dictionary[x][counter] = (char) (97 + k);
                }
                x++;
                fillDictionary(dictionary, numberOfLetters-1);
            }
        }*/
        return dictionary;
    }
}



