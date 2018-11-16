package sumOfLeftLeaves;

import model.TreeNode;

/**
 * @author lqclester
 **/
public class SumOfLeftLeaves2 {

  /**
   * 思想：
   * @param root
   * @return
   */
  public static int sumOfLeftLeaves(TreeNode root) {
    if (root == null) return 0;
    return getValue(root.left, true) + getValue(root.right, false);

  }

  private static int getValue(TreeNode node, boolean isLeft) {
    if (node == null) return 0;
    // 叶子节点
    if (node.left == null && node.right == null) return isLeft ? node.val : 0;

    return getValue(node.left, true) + getValue(node.right, false);

  }

}
