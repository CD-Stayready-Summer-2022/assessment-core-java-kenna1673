package com.codedifferently.assessment01.part05;

import java.util.ArrayList;

public class Palindrome {
    public Integer countPalindromes(String input){
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                substrings.add(input.substring(i, j));
            }
        }
        int total = 0;
        for (String sub : substrings) {
            StringBuilder builder = new StringBuilder(sub);
            String reverse = builder.reverse().toString();
            if (sub.equals(reverse)) {
                total++;
            }
        }
        return total;
    }
}
