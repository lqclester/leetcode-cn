package leetcode.base.quickSort;

/**
 * @author lqclester
 */
class Solution3 {
    public void quickSort(Integer[] arr, int startIndex, int endIndex) {

        // 递归结束条件：startIndex大等于endIndex的时候

        if (startIndex >= endIndex) {
            return;
        }

        // 得到基准元素位置
        int pivotIndex = partition(arr, startIndex, endIndex);
        // 用分治法递归数列的两部分
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }


    int partition(Integer[] array, int startIndex, int endIndex) {
        // 取第一个位置的元素作为基准元素
        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex; //开始时左坑，找到右边的填进去；index = right 坑变成左边...
        while (left <= right) {
            //right指针从右向左进行比较
            while (right >= left) {
                if (array[right] < pivot) {
                    array[left] = array[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (array[left] > pivot) {
                    array[right] = array[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
            array[index] = pivot;

        }
        return index;
    }
}
