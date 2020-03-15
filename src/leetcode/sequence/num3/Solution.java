package leetcode.sequence.num3;

import java.util.HashMap;

/**
 * @author lqclester
 **/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() <= 0) return 0;
        int max = 1;
        int lastIndex = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Integer j = map.get(chars[i]);
            if (j != null) { //存在字符
                if (j >= lastIndex) {
                    lastIndex = j + 1;
                }
                map.remove(chars[i]);
            }
            map.put(chars[i], i);
            int length  = i - lastIndex + 1;
            if (max < length) max = length; //保存当前最大长度
        }
        return max;
    }
}
