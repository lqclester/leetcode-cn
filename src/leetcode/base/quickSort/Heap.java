package leetcode.base.quickSort;

import java.util.Arrays;

/**
 * @author lqclester
 */
public class Heap {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 2, 1, 3, 2, 1, 9};
        buildHeap(array);
        System.out.println(Arrays.toString(array));

    }

    private static void buildHeap(int[] array) {

        // 从最后一个非叶子节点开始，依次下沉调整
        for (int i = 0; i < array.length; i++) {
            downAdjust(array, i, array.length - 1);
        }
    }

    private static void downAdjust(int[] array, int start, int end) {

    }


}
