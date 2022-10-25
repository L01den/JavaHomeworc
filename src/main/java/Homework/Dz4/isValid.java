package Homework.Dz4;

import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
        String s = "()[]{}";
        Solution sol = new Solution();
        System.out.println(sol.isValid(s));

    }

    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(c);
                }

            }
            return stack.isEmpty();
        }
    }
}
