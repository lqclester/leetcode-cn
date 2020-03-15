package leetcode.sequence.num404;

import leetcode.model.TreeNode;

import static leetcode.model.Utils.stringToTreeNode;

/**
 * @author lqclester
 *
 * 404 左叶子之和: https://leetcode-cn.com/problems/sum-of-left-leaves/
 **/
public class Solution {
  public static void main(String[] args) {
    TreeNode root = stringToTreeNode("[0,2,4,1,null,3,-1,5,1,null,6,null,8]");
    System.out.println(SumOfLeftLeaves.sumOfLeftLeaves(root));
  }
}
