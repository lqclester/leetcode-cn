package leetcode.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lqclester
 */
public class Utils {

    public static char[][] toCharCharArray(String arrayStr) {
        if (arrayStr == null || arrayStr.length() <= 4) {
            return new char[][]{};
        } else {
            //],
            String[] elements = arrayStr.substring(1, arrayStr.length() - 2).split("],");
            char[][] result = new char[elements.length][];
            for (int i = 0; i < result.length; i++) {
                String[] element = elements[i].substring(1).split(",");
                result[i] = new char[element.length];
                for (int j = 0; j < element.length; j++) {
                    if (element[j].length() <= 0) {
                        continue;
                    }
                    result[i][j] = element[j].charAt(1);
                }
            }
            return result;
        }
    }

    public static int[][] toIntIntArray(String arrayStr) {
        if (arrayStr == null || arrayStr.length() <= 4) {
            return new int[][]{};
        } else {
            //],
            String[] elements = arrayStr.substring(1, arrayStr.length() - 2).split("],");
            int[][] result = new int[elements.length][];
            for (int i = 0; i < result.length; i++) {
                String[] element = elements[i].substring(1).split(",");
                result[i] = new int[element.length];
                for (int j = 0; j < element.length; j++) {
                    if (element[j].length() <= 0) {
                        continue;
                    }
                    result[i][j] = Integer.parseInt(element[j]);
                }
            }
            return result;
        }
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
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


    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

    public static String[] toStrArray(String arrayStr) {
        if (arrayStr == null || arrayStr.length() <= 2) {
            return new String[]{};
        }
        String[] arrays = arrayStr.substring(1, arrayStr.length() - 2).split(",");
        return Arrays.stream(arrays).map(str -> {
            str = str.trim();
            return str.replaceAll("\"", "");
        }).toArray(String[]::new);
    }

    public static int[] toIntegerArray(String arrayStr) {
        if (arrayStr == null || arrayStr.length() <= 2) {
            return new int[]{};
        }
        String[] arrays = arrayStr.substring(1, arrayStr.length() - 1).split(",");
        Integer[] integers = Arrays.stream(arrays).map(str -> {
            str = str.trim();
            str = str.replaceAll("\"", "");
            return str;
        }).filter(str -> str.length() > 0).map(str -> {
            if (str.contains("-")) {
                return Integer.parseInt(str.replaceAll("-", "")) * -1;
            } else {
                return Integer.parseInt(str);
            }
        }).toArray(Integer[]::new);
        int[] result = new int[integers.length];
        for (int i = 0; i < integers.length; i++) {
            result[i] = integers[i];
        }
        return result;
    }
}
