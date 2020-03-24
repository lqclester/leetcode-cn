package leetcode.bytedance.num2;

/**
 * @author lqclester
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(new Solution().longestCommonPrefix(new String[] {"","b"}));
        System.out.println(new Solution().longestCommonPrefix(new String[] {"",""}));
        System.out.println(new Solution().longestCommonPrefix(new String[] {"c","c"}));
    }
}
