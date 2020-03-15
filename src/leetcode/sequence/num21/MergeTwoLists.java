package leetcode.sequence.num21;

import leetcode.model.ListNode;
import leetcode.model.Utils;

import java.io.IOException;

/**
 * @author lqclester
 *
 * 21. 合并两个有序链表
 */
public class MergeTwoLists {


    public static void main(String[] args) throws IOException {
        ListNode l1 = Utils.stringToListNode("[-6,-3,-2,2,3]");
        ListNode l2 = Utils.stringToListNode("[-10,-8,-6,-5,1,6,7]");
        //[-10,-8,-6,-6,-5,-3,-2,1,2,3,6,7]
        ListNode ret = new Solution().mergeTwoLists(l1, l2);

        String out = Utils.listNodeToString(ret);

        System.out.println(out);
    }
}
