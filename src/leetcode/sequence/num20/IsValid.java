package leetcode.sequence.num20;

import java.util.Stack;

/**
 * @author lqclester
 */
public class IsValid {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("{[]}"));
        System.out.println(new Solution().isValid("([)]"));
    }

    private static class Solution {
        public boolean isValid(String s) {
            char l1 = '{', l2 = '[', l3 = '(';
            char r1 = '}', r2 = ']', r3 = ')';
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == l1 || c == l2 || c == l3) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char popChar = stack.pop();
                    if (popChar == l1 && c != r1) return false;
                    if (popChar == l2 && c != r2) return false;
                    if (popChar == l3 && c != r3) return false;
                }
            }
            return stack.isEmpty();
        }
    }
}
