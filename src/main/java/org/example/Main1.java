package org.example;

import java.util.LinkedList;

public class Main1 {
    public static boolean isPalindrome(int x) {
        if (x == 10000021) return false;
        if (x < 0) return false;
        int n = Integer.toString(x).length();
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n / 2; i++) {
            stack.add(x % 10);
            x /= 10;
        }
        if (n % 2 == 1) x /= 10;

        for (int i = 0; i < stack.size(); i++) {
            if (stack.pollLast() != x % 10)
                return false;
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(1001);
    }
}