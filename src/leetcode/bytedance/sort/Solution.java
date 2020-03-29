package leetcode.bytedance.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lqclester
 * <p>
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 3) {
            return new ArrayList<>(0);
        }
        for (int i = 0; i < nums.length - 2; i++) {
            List<Integer> list = new ArrayList<>(3);
            target(nums, list, 0, 3, i, nums.length - 1);
            if (list.size() == 3) {
                lists.add(list);
            }
        }
        return lists;
    }

    private void target(int[] nums, List<Integer> list, int sum, int addNum, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return;
        }
        if (addNum == 1) {
            for (int i = startIndex; i <= endIndex; i++) {
                if (nums[i] == sum) {
                    list.add(nums[i]);
                }
            }
        }
        target(nums, list, sum - nums[startIndex], addNum - 1, startIndex + 1, endIndex);
    }
}