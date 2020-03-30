package leetcode.meeting.num62;

/**
 * @author lqclester
 */
public class LastRemainingFail {
    public static void main(String[] args) {
        System.out.println(new Solution().lastRemaining(2, 3));
    }

    private static class Solution {
        public int lastRemaining(int n, int m) {
            if (n == 1) {
                return 0;
            }
            Node start = new Node(0);
            Node current = start;
            int size = n;
            for (int i = 1; i < n; i++) {
                current.next = new Node(i);
                current = current.next;
            }
            current.next = start;
            //delete
            Node pre = start;
            current = start;
            while (size > 1) {
                for (int i = 1; i < m; i++) {
                    pre = current;
                    current = current.next;
                }
                pre.next = current.next;
                current = pre.next;
                size--;
            }
            return current.val;
        }

        class Node {
            int val;
            Node next;

            public Node(int val) {
                this.val = val;
            }
        }
    }
}
/**
 * 模拟链表，O(n^2)O(n
 * 2
 *  )
 * 如果单纯用链表模拟的话，时间复杂度是 O(nm)O(nm) 的，可以看下题目的数据范围，肯定是不能这么做的。关于运行时间的预估，经验是如果 n<10^5n<10
 * 5
 *   ，那么 O(n^2)O(n
 * 2
 *  ) 的解法耗时大概是几秒左右（当然时间复杂度会忽略常数，而且也有可能由于执行程序的机器性能的不同， O(n^2)O(n
 * 2
 *  ) 的实际耗时也有可能一秒多，也有可能十几秒）。本题由于 1 <= m <= 10^61<=m<=10
 * 6
 *   ，所以 O(nm)O(nm) 肯定是超时的。
 *
 * 可以分析下纯暴力的做法，每次找到删除的那个数字，需要 O(m)O(m) 的时间复杂度，然后删除了 n-1n−1 次。但实际上我们可以直接找到下一个要删除的位置的！
 *
 * 假设当前删除的位置是 idxidx ,下一个删除的数字的位置是 idx + midx+m 。但是，由于把当前位置的数字删除了，后面的数字会前移一位，所以实际的下一个位置是 idx + m - 1idx+m−1。由于数到末尾会从头继续数，所以最后取模一下，就是 (idx + m - 1) \pmod n(idx+m−1)(modn)。
 *
 * 至于这种思路的代码实现，我尝试了下 LinkedList 会超时，我猜是因为 LinkedList 虽然删除指定节点的时间复杂度是 O(n)O(n) 的，但是在 remove 时间复杂度仍然是 O(n)O(n) 的，因为需要从头遍历到需要删除的位置。那 ArrayList 呢？索引到需要删除的位置，时间复杂度是 O(1)O(1)，删除元素时间复杂度是 O(n)O(n)（因为后续元素需要向前移位）， remove 整体时间复杂度是 O(n)O(n) 的。看起来LinkedList 和 ArrayList 单次删除操作的时间复杂度是一样的 ？所累哇多卡纳！ArrayList 的 remove 操作在后续移位的时候，其实是内存连续空间的拷贝的！所以相比于LinkedList大量非连续性地址访问，ArrayList的性能是很OK的！
 *
 * 作者：sweetieeyi
 * 链接：https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/solution/javajie-jue-yue-se-fu-huan-wen-ti-gao-su-ni-wei-sh/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */



