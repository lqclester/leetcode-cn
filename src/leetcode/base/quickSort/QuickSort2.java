package leetcode.base.quickSort;

import java.util.Arrays;

/**
 * @author lqclester
 */
public class QuickSort2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(new Integer[]{3, 3, 2, 1})));
        System.out.println(Arrays.toString(sort(new Integer[]{9, 8, 5, 3, 2, 6, 12, 2, 1, 1, 0})));
        System.out.println(Arrays.toString(sort(new Integer[]{})));
        System.out.println(Arrays.toString(sort(new Integer[]{0})));
        System.out.println(Arrays.toString(sort(new Integer[]{0, 1})));
        System.out.println(Arrays.toString(sort(new Integer[]{1, 0})));
    }

    public static Integer[] sort(Integer[] array) {
        if (array.length <= 0) {
            return array;
        }
        new Solution2().quickSort(array, 0, array.length - 1);
        return array;
    }
}
