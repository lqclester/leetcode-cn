package xyz.getshare.leetcode.sequence.num21;

import xyz.getshare.leetcode.model.ListNode;

import java.io.IOException;

import static xyz.getshare.leetcode.model.Utils.*;

/**
 * @author lqclester
 *
 * 21. 合并两个有序链表
 */
public class MergeTwoLists {


    public static void main(String[] args) throws IOException {
        ListNode l1 = stringToListNode("[-6,-3,-2,2,3]");
        ListNode l2 = stringToListNode("[-10,-8,-6,-5,1,6,7]");
        //[-10,-8,-6,-6,-5,-3,-2,1,2,3,6,7]
        ListNode ret = new Solution().mergeTwoLists(l1, l2);

        String out = listNodeToString(ret);

        System.out.println(out);
    }
}
