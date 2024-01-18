package org.example;

import java.util.LinkedList;

public class Main3 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int n = Integer.toString(x).length();
        for (int i = 1; i < n / 2; i++) {
            int lastDigit = (int) ((x % (Math.pow(10, i)))/(Math.pow(10, i - 1)));
            int firstDigit = (int) ((x / (Math.pow(10, n - i))) % 10);
            if (lastDigit != firstDigit) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10011));
    }
}