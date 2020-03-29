package leetcode.bytedance.string.num1;

import java.util.HashSet;

/**
 * @author lqclester
 * 滑动窗口
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int max = 1;
        int left = 0, right = 0;
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>(s.length());
        while (left < chars.length) {
            while (right < chars.length && set.add(chars[right])) {
                right++;
            }
            max = Math.max(max, right - left);
            set.remove(chars[left++]);
        }
        return max;
    }
}
