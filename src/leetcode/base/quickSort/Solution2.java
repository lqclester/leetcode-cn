package leetcode.base.quickSort;

/**
 * @author lqclester
 */
class Solution2 {
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

        while (left != right) {
            while (left < right && array[right] > pivot) {
                right--;//找到第一个小于pivot的数
            }
            while (left < right && array[left] <= pivot) {
                left++;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        //pivot和指针重合点交换
        int temp = array[left]; // while(array{left] <= pivot
        array[left] = array[startIndex];
        array[startIndex] = temp;
        return left;
    }
}
