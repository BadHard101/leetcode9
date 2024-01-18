package org.example;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        StringBuilder builder = new StringBuilder(Integer.toString(x));
        return builder.toString().contentEquals(builder.reverse());
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}