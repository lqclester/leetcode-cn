package leetcode.bytedance.string.num1;

import java.util.*;

/**
 * @author lqclester
    方法1： 用递归找+Set的特性找，可以减少判断次数
 */
class Solution1 {
    public int lengthOfLongestSubstring(String s) {

        if (s ==null || s.length() == 0) {
            return 0;
        }
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            String maxSubStr = findMaxSubStr(s);
            max = Math.max(max, maxSubStr.length());
        }
        return max;
    }

    String findMaxSubStr(String str) {
        Set<Character> characterSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            characterSet.add(c);
        }
        if (characterSet.size() == str.length()) {
            return str;
        } else {
            if (str.length() <= 1) {
                return str;
            }
            String left = findMaxSubStr(str.substring(0, str.length() -1));
            String right = findMaxSubStr(str.substring(1));
            return left.length() > right.length() ? left : right;
        }
    }
}