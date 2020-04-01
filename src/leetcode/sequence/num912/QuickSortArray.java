package leetcode.sequence.num912;

import leetcode.model.Utils;

import java.util.Arrays;

import static leetcode.model.Utils.printArray;
import static leetcode.model.Utils.printIntArray;

/**
 * @author lqclester
 */
public class QuickSortArray {
    public static void main(String[] args) {
        printIntArray(new Solution().sortArray(Utils.toIntegerArray("[5,1,1,2,0,0]")));
        printIntArray(new Solution().sortArray(Utils.toIntegerArray("[5,2,3,1]")));
    }

    private static
    class Solution {
        public int[] sortArray(int[] nums) {
            if (nums == null || nums.length <= 1) {
                return nums;
            }
             quickSort(nums, 0, nums.length - 1);
            return nums;
        }

        private void quickSort(int[] nums, int startIndex, int endIndex) {
            if (startIndex >= endIndex) {
                return;
            }
            int pivot = partition(nums, startIndex, endIndex);
            quickSort(nums, startIndex, pivot - 1);
            quickSort(nums, pivot + 1, endIndex);
        }


        private int partition(int[] nums, int startIndex, int endIndex) {
            int pivot = nums[startIndex];
            int left = startIndex;
            int right = endIndex;
            while (left != right) {
                while (left < right && nums[right] > pivot) {
                    right--;
                }
                while (left < right && nums[left] <= pivot) {
                    left++;
                }
                if (left < right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
            }
            int temp = nums[left];
            nums[left] = nums[startIndex];
            nums[startIndex] = temp;
            return left;
        }
    }
}


