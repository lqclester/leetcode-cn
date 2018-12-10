package addTwoNumbers;

/**
 * @author lqclester
 **/
/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

import static model.Tools.listNodeToString;
import static model.Tools.stringToListNode;

import java.io.IOException;

import model.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int x) { val = x; } }
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode start = new ListNode(0);
        ListNode result = start;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int v1 = 0;
            int v2 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            result.next = new ListNode((v1 + v2 + carry) % 10);
            carry = (v1 + v2 + carry) / 10;
            result = result.next;
        }
        if (carry > 0) {
            result.next = new ListNode(carry);
        }
        return start.next;
    }
}

public class MainClass {

    public static void main(String[] args) throws IOException {
        ListNode l1 = stringToListNode("[1]");
        ListNode l2 = stringToListNode("[9,9]");
        ListNode ret = new Solution().addTwoNumbers(l1, l2);
        String out = listNodeToString(ret);
        System.out.println(out);
    }
}