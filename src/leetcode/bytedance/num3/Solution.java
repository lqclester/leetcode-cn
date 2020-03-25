package leetcode.bytedance.num3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lqclester
 */
class Solution {
    public boolean checkInclusion(String compareStr, String demo) {
        if (compareStr == null || compareStr.length() <= 0 || demo == null || demo.length() <= 0) {
            return false;
        }
        int compareStrTotal = sumStr(compareStr, 0, compareStr.length());
        int subStrLength = compareStr.length();
        for (int i = 0; i < demo.length() && (i + compareStr.length()) <= demo.length(); i++) {
            if (sumStr(demo, i, subStrLength) == compareStrTotal) {
                Set<Character> setA = new HashSet<>(subStrLength);
                Set<Character> setB = new HashSet<>(subStrLength);
                for (int j = 0; j < subStrLength; j++) {
                    setA.add(compareStr.charAt(j));
                    setB.add(demo.charAt(i+j));
                }
                if (setA.containsAll(setB) && setB.containsAll(setA)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int sumStr(String str, int start, int end) {
        int total = 0;
        for (int i =0, j= start; i < end; i++, j++) {
            total += str.charAt(j);
        }
        return total;
    }
}