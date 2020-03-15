package leetcode.sequence.num404;

import leetcode.model.TreeNode;

import java.util.Stack;

public class SumOfLeftLeaves {

  public static int sumOfLeftLeaves(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Stack<TreeNode> rightStack = new Stack<>();
    int leftSum = 0;
    do {
      TreeNode left = root.left;
      TreeNode right = root.right;
      if (right != null) {
        rightStack.add(right);
      }
      if (left != null) {
        leftSum += getLeftValue(left, rightStack);
      }
      root = rightStack.empty() ? null : rightStack.pop();
    } while (root != null);
    return leftSum;
  }

  private static int getLeftValue(TreeNode root, Stack<TreeNode> rightStack) {
    if (root.right != null) {
      rightStack.add(root.right);
    }
    if (root.left != null) {
      return getLeftValue(root.left, rightStack);
    }

    return root.right == null ? root.val : 0;
  }

}
