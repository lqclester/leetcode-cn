package leetcode.bytedance.num3;

/**
 * @author lqclester
 *
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
 *
 * 换句话说，第一个字符串的排列之一是第二个字符串的子串。
 * 示例1:
 *
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 *
 *
 * 示例2:
 *
 * 输入: s1= "ab" s2 = "eidboaoo"
 * 输出: False
 *
 */
public class CheckInclusion {
    public static void main(String[] args) {
/*        System.out.println(new Solution().checkInclusion("acccb", "eidbcccaooo"));
        System.out.println(new Solution().checkInclusion("accb", "eidbcccaooo"));
        System.out.println(new Solution().checkInclusion("adc", "dcda"));
        System.out.println(new Solution().checkInclusion("abc", "bbbca"));*/
        System.out.println(new Solution().checkInclusion("abc", "ccccccbbbbbbaaaa"));

    }
}
