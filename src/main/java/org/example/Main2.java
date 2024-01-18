package org.example;

import java.util.LinkedList;

public class Main2 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int n = Integer.toString(x).length();
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < n / 2; i++) {
            int lastDigit = x % 10;
            char lastDigitChar = (char) ('0' + lastDigit);

            stack.add(lastDigitChar);
            x /= 10;
        }
        if (n % 2 == 1) x /= 10;

        for (int i = 0; i < stack.size(); i++) {
            int lastDigit = x % 10;
            char lastDigitChar = (char) ('0' + lastDigit);

            if (stack.pollLast() != lastDigitChar)
                return false;
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(1001);
    }
}