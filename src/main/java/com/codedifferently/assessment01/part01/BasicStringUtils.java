package com.codedifferently.assessment01.part01;

public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str){
        String[] sentenceSplit = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String string : sentenceSplit) {
            String upperLetter = string.substring(0, 1).toUpperCase();
            String lowerLetters = string.substring(1).toLowerCase();
            String fullWord = upperLetter + lowerLetters;
            builder.append(fullWord);
        }
        return builder.toString();
    }

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();
    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        String[] sentenceSplit = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String string : sentenceSplit) {
            String lowerLetters = string.substring(0, string.length() - 1).toLowerCase();
            String upperLetter = string.substring(string.length() - 1).toUpperCase();
            String fullWord = lowerLetters + upperLetter;
            builder.append(fullWord);
        }
        return builder.reverse().toString();
    }

    public static String removeFirstAndLastCharacter(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(str.length() - 1);
        builder.deleteCharAt(0);
        return builder.toString();
    }
}
