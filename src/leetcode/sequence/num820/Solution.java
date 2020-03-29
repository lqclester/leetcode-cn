package leetcode.sequence.num820;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lqclester
 */
class Solution {
    public int minimumLengthEncoding(String[] words) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(words).sorted(Comparator.comparingInt(String::length).reversed()).forEach(
                work -> {
                    if (!builder.toString().contains(work + "#")) {
                        builder.append(work).append("#");
                    }
                }
        );
        return builder.length();
    }
}