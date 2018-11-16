package twoSum;

import java.io.IOException;
import java.util.HashMap;

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

public class MainClass {

  public static void main(String[] args) throws IOException {

    int[] nums = stringToIntegerArray("[2, 7, 11, 15]");
    nums = stringToIntegerArray("[2,7,11,15]");
    int[] ret = new Solution().twoSum(nums, 9);
    String out = integerArrayToString(ret);
    System.out.print(out);
  }

  public static int[] stringToIntegerArray(String input) {
    input = input.trim();
    input = input.substring(1, input.length() - 1);
    if (input.length() == 0) {
      return new int[0];
    }

    String[] parts = input.split(",");
    int[] output = new int[parts.length];
    for (int index = 0; index < parts.length; index++) {
      String part = parts[index].trim();
      output[index] = Integer.parseInt(part);
    }
    return output;
  }

  public static String integerArrayToString(int[] nums, int length) {
    if (length == 0) {
      return "[]";
    }

    String result = "";
    for (int index = 0; index < length; index++) {
      int number = nums[index];
      result += Integer.toString(number) + ", ";
    }
    return "[" + result.substring(0, result.length() - 2) + "]";
  }

  public static String integerArrayToString(int[] nums) {
    return integerArrayToString(nums, nums.length);
  }
}
