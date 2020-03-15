package leetcode.sequence.num1;

import java.io.IOException;

public class TwoSum {

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
