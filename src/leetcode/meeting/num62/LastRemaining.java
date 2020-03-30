package leetcode.meeting.num62;

import java.util.ArrayList;

/**
 * @author lqclester
 */
public class LastRemaining {
    public static void main(String[] args) {
        System.out.println(new Solution().lastRemaining(5, 3));
    }

    private static class Solution {
        public int lastRemaining(int n, int m) {
            if (n == 1) {
                return 0;
            }
            ArrayList<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int removeIndex = 0;
            while (list.size() > 1) {
                removeIndex = (removeIndex + m -1) % list.size();
                //  System.out.println("remove:" + list.get(removeIndex));
                list.remove(removeIndex);
            }
            return list.get(0);
        }
    }
}




