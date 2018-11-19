package mergeTwoLists;

import model.ListNode;

import java.io.IOException;

import static model.Tools.*;

/**
 * 模仿老师小学帮新学生们插入队伍，那种基本是最快的了。以 @param:l1 作为站好的队列。
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode start = l1.val < l2.val ? l1 : l2;
        do {
            if (p2.val <= p1.val) {
                while (p2.next != null && p2.next.val <= p1.val) {
                    p2 = p2.next;
                }
                l2 = p2.next;
                p2.next = p1;
            } else {
                while (p1.next != null && p1.next.val < p2.val) {
                    p1 = p1.next;
                }
                l2 = p2.next;
                p2.next = p1.next;
                p1.next = p2;
            }
            p2 = l2;
        } while (p2 != null);
        return start;
    }
}

public class MainClass {


    public static void main(String[] args) throws IOException {
        ListNode l1 = stringToListNode("[-6,-3,-2,2,3]");
        ListNode l2 = stringToListNode("[-10,-8,-6,-5,1,6,7]");
        //[-10,-8,-6,-6,-5,-3,-2,1,2,3,6,7]
        ListNode ret = new Solution().mergeTwoLists(l1, l2);

        String out = listNodeToString(ret);

        System.out.println(out);
    }
}
