package leetcode.sequence.num1;

import java.util.HashMap;

/**
 * @author lqclester
 */
class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer[]> map = new HashMap<>(nums.length);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer[] mapGet = map.get(nums[i]);
            if (mapGet == null) {
                Integer[] tmp = new Integer[2];
                tmp[0] = i; //下标
                tmp[1] = nums[i];//值
                map.put(target - nums[i], tmp);
            } else {
                result[0] = mapGet[0];
                result[1] = i;
                break;
            }
        }
        return result;
    }

    /**
     * 两重循环，暴力解
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = i + 1;
        boolean find = false;
        for (; i < nums.length && !find; i++) {
            result[0] = nums[i];
            result[1] = target - result[0];
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] == result[1]) {
                    find = true;
                    break;
                }
            }
        }
        result[0] = i - 1;
        result[1] = j;
        return result;
    }
}
