package com.wadas.sort;

/**
 * @author: longfellow
 * @date: 2020/4/20
 */
public class MergeSort {
    /**
     * 归并排序，分为两种，自顶向下归并和自底向上归并
     */

    /**
     * 辅助函数 merge 一个数组的前后两部分。
     */
    private void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end-start+1];    // tmp是汇总2个有序区的临时区域
        int i = start;            // 第1个有序区的索引
        int j = mid + 1;        // 第2个有序区的索引
        int k = 0;                // 临时区域的索引

        while(i <= mid && j <= end) {
            if (a[i] <= a[j])
                tmp[k++] = a[i++];
            else
                tmp[k++] = a[j++];
        }

        while(i <= mid)
            tmp[k++] = a[i++];

        while(j <= end)
            tmp[k++] = a[j++];

        // 将排序后的元素，全部都整合到数组a中。
        for (i = 0; i < k; i++)
            a[start + i] = tmp[i];

        tmp = null;
    }

    /*
     * 归并排序(从上往下)
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     start -- 数组的起始地址
     *     endi -- 数组的结束地址
     */
    public void mergeSortUp2Down(int[] a, int start, int end) {
        if(a==null || start >= end)
            return ;

        int mid = (end + start)/2;
        mergeSortUp2Down(a, start, mid); // 递归排序a[start...mid]
        mergeSortUp2Down(a, mid+1, end); // 递归排序a[mid+1...end]

        // a[start...mid] 和 a[mid...end]是两个有序空间，
        // 将它们排序成一个有序空间a[start...end]
        merge(a, start, mid, end);
    }
}
