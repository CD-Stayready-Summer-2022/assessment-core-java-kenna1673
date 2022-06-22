package com.codedifferently.assessment01.part01;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){
        return sentence.split(" ");
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){
        String[] sentenceSplit = sentence.split(" ");
        return sentenceSplit[0];
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
        String[] sentenceSplit = sentence.split(" ");
        String firstWord = sentenceSplit[0];
        StringBuilder firstWordBuilder = new StringBuilder(firstWord);
        return firstWordBuilder.reverse().toString();
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){
        String[] sentenceSplit = sentence.split(" ");
        String firstWord = sentenceSplit[0];
        StringBuilder firstWordBuilder = new StringBuilder(firstWord);
        String reverseString = firstWordBuilder.reverse().toString();
        String firstLetterUpper = reverseString.substring(0, 1).toUpperCase();
        String otherLettersLower = reverseString.substring(1).toLowerCase();
        return firstLetterUpper + otherLettersLower;
    }

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder builder = new StringBuilder(str);
        return builder.deleteCharAt(index).toString();
    }
}
