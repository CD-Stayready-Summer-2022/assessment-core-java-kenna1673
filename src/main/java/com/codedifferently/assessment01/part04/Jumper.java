package com.codedifferently.assessment01.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int remainder = k % j;
        int numberOfJumpHeightJumpsToFlag = k / j;
        if (remainder == 0) {
            return numberOfJumpHeightJumpsToFlag;
        }
        return numberOfJumpHeightJumpsToFlag + remainder;
    }
}
