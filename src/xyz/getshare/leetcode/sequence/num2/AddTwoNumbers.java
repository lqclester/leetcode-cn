package xyz.getshare.leetcode.sequence.num2;

import xyz.getshare.leetcode.model.ListNode;

import java.io.IOException;

import static xyz.getshare.leetcode.model.Utils.listNodeToString;
import static xyz.getshare.leetcode.model.Utils.stringToListNode;


public class AddTwoNumbers {

    public static void main(String[] args) throws IOException {
        ListNode l1 = stringToListNode("[1]");
        ListNode l2 = stringToListNode("[9,9]");
        ListNode ret = new Solution().addTwoNumbers(l1, l2);
        String out = listNodeToString(ret);
        System.out.println(out);
    }
}