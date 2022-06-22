package com.codedifferently.assessment01.part01;

public class IntegerArrayUtils {
    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */
    public static Integer getSum(Integer[] intArray){
        int total = 0;
        for (Integer number : intArray) {
            total += number;
        }
        return total;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        int total = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            total *= intArray[i];
        }
        return total;
    }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray){
        int total = 0;
        for (Integer number : intArray) {
            total += number;
        }
        return (double) total / intArray.length;
    }
}
