package leetcode.sequence.num2;

import leetcode.model.ListNode;
import leetcode.model.Utils;

import java.io.IOException;


public class AddTwoNumbers {

    public static void main(String[] args) throws IOException {
        ListNode l1 = Utils.stringToListNode("[1]");
        ListNode l2 = Utils.stringToListNode("[9,9]");
        ListNode ret = new Solution().addTwoNumbers(l1, l2);
        String out = Utils.listNodeToString(ret);
        System.out.println(out);
    }
}