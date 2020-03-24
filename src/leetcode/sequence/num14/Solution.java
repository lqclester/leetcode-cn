package leetcode.sequence.num14;

/**
 * @author lqclester
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder commonPrefix = new StringBuilder("");
        int j = 0;
        boolean isGoodChar = true;
        while (j < strs[strs.length - 1].length() && isGoodChar) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].length() <= j || strs[i].charAt(j) != strs[strs.length - 1].charAt(j)) {
                    isGoodChar = false;
                    break;
                }
            }
            if (isGoodChar) {
                commonPrefix.append(strs[strs.length - 1].charAt(j));
            }
            j++;
        }
        return commonPrefix.toString();
    }
}