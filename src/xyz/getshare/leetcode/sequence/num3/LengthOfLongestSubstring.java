package xyz.getshare.leetcode.sequence.num3;


import java.io.IOException;
import java.util.*;

public class LengthOfLongestSubstring {

    public static void main(String[] args) throws IOException {
        int ret;
        ret = new Solution().lengthOfLongestSubstring("dvdstyussssssasdasdsadqwertyiopff");
        System.out.println(ret);
        ret = new Solution().lengthOfLongestSubstring("aab");
        System.out.println(ret);
        ret = new Solution().lengthOfLongestSubstring("dvdf");
        System.out.println(ret);
        ret = new Solution().lengthOfLongestSubstring("au");
        System.out.println(ret);
    }
}